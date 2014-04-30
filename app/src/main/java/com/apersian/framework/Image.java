package com.apersian.framework;

import com.apersian.framework.Graphics.ImageFormat;

public interface Image {

	public int getWidth();

	public int getHeight();

	public ImageFormat getFormat();

	public void dispose();

}