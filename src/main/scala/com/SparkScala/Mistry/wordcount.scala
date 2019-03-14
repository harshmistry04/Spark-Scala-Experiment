package com.SparkScala.Mistry

import org.apache.spark.sql.SparkSession

object wordcount extends App{

  val spark = SparkSession.builder
    .appName("My Spark Application")
    .getOrCreate

  val rdd = spark.range(5).cache
  println(rdd.count())
}
