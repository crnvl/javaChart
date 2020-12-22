package com.angelsflyinhell.javaChart.util;

import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

public class javaChart {

    public static void process(HashMap<Integer, Integer> nodes, String author) throws IOException {
        double[] xData = new double[nodes.size()];
        double[] yData = new double[nodes.size()];

        for (int i = 0; i < nodes.size(); i++) {
            xData[i] = i + 1;
            yData[i] = nodes.get(i);
        }
        Color Blurple = new Color(114, 137, 218, 150);
        Color[] colors = new Color[nodes.size()];
        for (int i = 0; i < nodes.size(); i++) {
            colors[i] = Blurple;
        }
// Create Chart
        XYChart chart = new XYChartBuilder().width(934).height(282).title("XP Gain of " + author).xAxisTitle("Days").yAxisTitle("XP").build();
        chart.addSeries("Gain", xData, yData);

        chart.getStyler().setAntiAlias(true);
        chart.getStyler().setSeriesColors(colors);
        chart.getStyler().setPlotGridVerticalLinesVisible(false);

        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNE);

        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Area);

        chart.getStyler().setChartBackgroundColor(UtilColor.hex2Rgb("#2C2F33"));
        chart.getStyler().setPlotBackgroundColor(UtilColor.hex2Rgb("#2C2F33"));
        chart.getStyler().setLegendBackgroundColor(UtilColor.hex2Rgb("#2C2F33"));

        chart.getStyler().setChartFontColor(UtilColor.hex2Rgb("#FFFFFF"));
        chart.getStyler().setAnnotationsFontColor(UtilColor.hex2Rgb("#FFFFFF"));

// Save it
        BitmapEncoder.saveBitmap(chart, "./chart", BitmapEncoder.BitmapFormat.PNG);
    }

}
