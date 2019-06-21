package com.tencent.tmassistantsdk.protocol.jce;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

public final class JceCmd
  implements Serializable
{
  public static final JceCmd Empty;
  public static final JceCmd GetAppSimpleDetail;
  public static final JceCmd GetAppUpdate;
  public static final JceCmd GetSettings;
  public static final JceCmd ReportApkFileInfo;
  public static final JceCmd ReportLog;
  public static final int _Empty = 0;
  public static final int _GetAppSimpleDetail = 5;
  public static final int _GetAppUpdate = 3;
  public static final int _GetSettings = 2;
  public static final int _ReportApkFileInfo = 4;
  public static final int _ReportLog = 1;
  private static JceCmd[] __values;
  private String __T;
  private int __value;

  static
  {
    AppMethodBeat.i(76065);
    if (!JceCmd.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      __values = new JceCmd[6];
      Empty = new JceCmd(0, 0, "Empty");
      ReportLog = new JceCmd(1, 1, "ReportLog");
      GetSettings = new JceCmd(2, 2, "GetSettings");
      GetAppUpdate = new JceCmd(3, 3, "GetAppUpdate");
      ReportApkFileInfo = new JceCmd(4, 4, "ReportApkFileInfo");
      GetAppSimpleDetail = new JceCmd(5, 5, "GetAppSimpleDetail");
      AppMethodBeat.o(76065);
      return;
    }
  }

  private JceCmd(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(76064);
    this.__T = new String();
    this.__T = paramString;
    this.__value = paramInt2;
    __values[paramInt1] = this;
    AppMethodBeat.o(76064);
  }

  public static JceCmd convert(int paramInt)
  {
    AppMethodBeat.i(76062);
    int i = 0;
    Object localObject;
    if (i < __values.length)
      if (__values[i].value() == paramInt)
      {
        localObject = __values[i];
        AppMethodBeat.o(76062);
      }
    while (true)
    {
      return localObject;
      i++;
      break;
      if (!$assertionsDisabled)
      {
        localObject = new AssertionError();
        AppMethodBeat.o(76062);
        throw ((Throwable)localObject);
      }
      localObject = null;
      AppMethodBeat.o(76062);
    }
  }

  public static JceCmd convert(String paramString)
  {
    AppMethodBeat.i(76063);
    int i = 0;
    if (i < __values.length)
      if (__values[i].toString().equals(paramString))
      {
        paramString = __values[i];
        AppMethodBeat.o(76063);
      }
    while (true)
    {
      return paramString;
      i++;
      break;
      if (!$assertionsDisabled)
      {
        paramString = new AssertionError();
        AppMethodBeat.o(76063);
        throw paramString;
      }
      paramString = null;
      AppMethodBeat.o(76063);
    }
  }

  public final String toString()
  {
    return this.__T;
  }

  public final int value()
  {
    return this.__value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.protocol.jce.JceCmd
 * JD-Core Version:    0.6.2
 */