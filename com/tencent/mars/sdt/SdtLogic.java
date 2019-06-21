package com.tencent.mars.sdt;

import com.tencent.mars.Mars;
import java.util.ArrayList;

public class SdtLogic
{
  private static final String TAG = "mars.SdtLogic";
  private static SdtLogic.ICallBack callBack;

  static
  {
    try
    {
      ArrayList localArrayList = getLoadLibraries();
      Mars.checkLoadedModules(localArrayList, "mars.SdtLogic");
      callBack = null;
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
      {
        Object localObject = null;
        Mars.loadDefaultMarsLibrary();
      }
    }
  }

  private static native ArrayList<String> getLoadLibraries();

  private static void reportSignalDetectResults(String paramString)
  {
  }

  public static void setCallBack(SdtLogic.ICallBack paramICallBack)
  {
    callBack = paramICallBack;
  }

  public static native void setHttpNetcheckCGI(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mars.sdt.SdtLogic
 * JD-Core Version:    0.6.2
 */