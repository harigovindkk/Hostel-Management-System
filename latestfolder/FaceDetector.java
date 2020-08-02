/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.objdetect.CascadeClassifier;

/**
 *
 * @author rr1
 */
public class FaceDetector {
    public static int faceCount(String imglocation) {
        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );

            // Reading the Image from the file and storing it in to a Matrix object

            Mat src = Imgcodecs.imread(imglocation);

            // Instantiating the CascadeClassifier
            String xmlFile = "haarcascade_frontalface_default.xml";

            CascadeClassifier classifier = new CascadeClassifier(xmlFile);
            
            // Detecting the face in the snap
            MatOfRect faceDetections = new MatOfRect();
            classifier.detectMultiScale(src, faceDetections);
            return faceDetections.toArray().length;
    }
}
