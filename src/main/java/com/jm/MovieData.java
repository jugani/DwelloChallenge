package com.jm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.google.gson.*;

public class MovieData {

    static String inputUrl = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";
    static List<String> list = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String substr = in.nextLine();
        MovieData movieData = new MovieData();
        StringBuilder sb = new StringBuilder();
        sb.append(inputUrl + substr);

        String requestURL = sb.toString();
        movieData.getMovieTitles(requestURL);

        Collections.sort(list);
        String[] title = new String[list.size()];
        list.toArray(title);
        for (String s : title
                ) {
            System.out.println(s);

        }


    }

    static void httpRequest(String url) throws IOException {

        URL urlobj = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) urlobj.openConnection();
        httpURLConnection.setRequestMethod("GET");
        if (httpURLConnection.getResponseCode() == 200) {
            BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String response = br.readLine();
            JsonElement jelement = new JsonParser().parse(response);
            JsonObject jsonObject = jelement.getAsJsonObject();
            JsonArray dataarray = jsonObject.getAsJsonArray("data");
            System.out.println(dataarray.size());


            for (JsonElement obj :
                    dataarray) {
                JsonObject jsonObject1 = obj.getAsJsonObject();

                list.add(jsonObject1.get("Title").toString());


            }


        }


    }


    static void getMovieTitles(String url) throws IOException {

        URL urlobj = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) urlobj.openConnection();
        httpURLConnection.setRequestMethod("GET");
        if (httpURLConnection.getResponseCode() == 200) {
            BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String response = br.readLine();
            JsonElement jelement = new JsonParser().parse(response);
            JsonObject jsonObject = jelement.getAsJsonObject();
            int total_pages = Integer.parseInt(String.valueOf(jsonObject.get("total_pages")));
            int per_page = Integer.parseInt(String.valueOf(jsonObject.get("per_page")));

            while (total_pages != 0) {

                String requesturl = url.concat("&page=" + total_pages);
                httpRequest(requesturl);

                total_pages--;
            }

        }

    }
}
