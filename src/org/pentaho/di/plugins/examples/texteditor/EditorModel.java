package org.pentaho.di.plugins.examples.texteditor;

import org.pentaho.ui.xul.XulEventSourceAdapter;

import java.beans.XMLEncoder;
import java.io.*;

/**
 * This is a simple backing model for our Note application. Models are entirely optional, but encouraged.
 *
 * User: nbaker
 * Date: 1/7/11
 */
public class EditorModel extends XulEventSourceAdapter{
  private String fileName;
  private String text;

  public void setFileName(String fName){
    String prevVal = this.fileName;
    this.fileName = fName;
    firePropertyChange("fileName", prevVal, fName);
  }

  public String getFileName(){
    return fileName;
  }

  public String getText(){
    return text;
  }

  public void setText(String txt){
    String prevVal = this.text;
    this.text = txt;
    firePropertyChange("text", prevVal, txt);
  }

  
}
