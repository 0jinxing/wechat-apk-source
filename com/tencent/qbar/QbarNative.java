package com.tencent.qbar;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class QbarNative
{
  public byte[] Aqt;
  public int[] Aqu;
  public byte[] Aqv;
  public int[] Aqw;
  public int Aqx;
  public byte[] data;
  public byte[] type;

  static
  {
    AppMethodBeat.i(56476);
    System.loadLibrary("wechatQrMod");
    AppMethodBeat.o(56476);
  }

  public QbarNative()
  {
    AppMethodBeat.i(56461);
    this.type = new byte[100];
    this.data = new byte[3000];
    this.Aqt = new byte[100];
    this.Aqu = new int[4];
    this.Aqv = new byte[300];
    this.Aqw = new int[2];
    this.Aqx = -1;
    AppMethodBeat.o(56461);
  }

  private static native int Encode(byte[] paramArrayOfByte, int[] paramArrayOfInt, String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3);

  private static native int EncodeBitmap(String paramString1, Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2, int paramInt5);

  public static native int FocusInit(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4);

  public static native boolean FocusPro(byte[] paramArrayOfByte, boolean paramBoolean, boolean[] paramArrayOfBoolean);

  public static native int FocusRelease();

  private native int GetCodeDetectInfo(QbarNative.QBarCodeDetectInfo[] paramArrayOfQBarCodeDetectInfo, QbarNative.QBarPoint[] paramArrayOfQBarPoint, int paramInt);

  private native int GetDetailResults(QbarNative.QBarResultJNI[] paramArrayOfQBarResultJNI, QbarNative.QBarPoint[] paramArrayOfQBarPoint, QbarNative.QBarReportMsg[] paramArrayOfQBarReportMsg, int paramInt);

  private native int GetDetectInfoByFrames(QbarNative.QBarCodeDetectInfo paramQBarCodeDetectInfo, QbarNative.QBarPoint paramQBarPoint, int paramInt);

  private native int GetOneResult(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int[] paramArrayOfInt, int paramInt);

  private native int GetOneResultReport(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt);

  private native int GetResults(QbarNative.QBarResultJNI[] paramArrayOfQBarResultJNI, int paramInt);

  private static native String GetVersion();

  private native int Init(int paramInt1, int paramInt2, String paramString1, String paramString2);

  private native int Init(int paramInt1, int paramInt2, String paramString1, String paramString2, QbarNative.QbarAiModelParam paramQbarAiModelParam);

  public static native int QIPUtilYUVCrop(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);

  private native int Release(int paramInt);

  private native int ScanImage(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  private native int SetReaders(int[] paramArrayOfInt, int paramInt1, int paramInt2);

  public static int a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(56472);
    if (paramArrayOfByte2 == null)
    {
      paramInt1 = -1;
      AppMethodBeat.o(56472);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = nativeYUVrotate(paramArrayOfByte1, paramArrayOfByte2, paramInt1, paramInt2);
      AppMethodBeat.o(56472);
    }
  }

  public static int a(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(56474);
    if (paramArrayOfByte == null)
    {
      paramInt1 = -1;
      AppMethodBeat.o(56474);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = nativeYuvToCropIntArray(paramArrayOfByte, paramArrayOfInt, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
      AppMethodBeat.o(56474);
    }
  }

  public static int a(byte[] paramArrayOfByte, int[] paramArrayOfInt, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(56463);
    paramInt1 = Encode(paramArrayOfByte, paramArrayOfInt, paramString1, paramInt1, paramInt2, paramString2, -1);
    AppMethodBeat.o(56463);
    return paramInt1;
  }

  public static int a(byte[] paramArrayOfByte1, int[] paramArrayOfInt, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    AppMethodBeat.i(56471);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
    {
      paramInt1 = -1;
      AppMethodBeat.o(56471);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = nativeGrayRotateCropSub(paramArrayOfByte2, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramArrayOfByte1, paramArrayOfInt, paramInt7, 0);
      AppMethodBeat.o(56471);
    }
  }

  public static int b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(56473);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
    {
      paramInt1 = -1;
      AppMethodBeat.o(56473);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = nativeCropGray2(paramArrayOfByte1, paramArrayOfByte2, paramInt1, paramInt2, 0);
      AppMethodBeat.o(56473);
    }
  }

  public static native int focusedEngineForBankcardInit(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);

  public static native int focusedEngineGetVersion();

  public static native int focusedEngineProcess(byte[] paramArrayOfByte);

  public static native int focusedEngineRelease();

  public static String getVersion()
  {
    AppMethodBeat.i(56462);
    String str = GetVersion();
    AppMethodBeat.o(56462);
    return str;
  }

  private static boolean isNullOrNil(String paramString)
  {
    AppMethodBeat.i(56475);
    boolean bool;
    if ((paramString == null) || (paramString.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(56475);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56475);
    }
  }

  private static native int nativeArrayConvert(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt);

  private static native int nativeCropGray2(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3);

  private static native int nativeGrayRotateCropSub(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte2, int[] paramArrayOfInt, int paramInt7, int paramInt8);

  public static native int nativeRelease();

  private static native int nativeTransBytes(int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  private static native int nativeTransPixels(int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  private static native int nativeYUVrotate(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2);

  private static native int nativeYUVrotateLess(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  private static native int nativeYuvToCropIntArray(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);

  native int AddBlackInternal(int paramInt1, int paramInt2);

  native int AddBlackList(String paramString, int paramInt);

  native int AddWhiteList(String paramString, int paramInt);

  public native int GetZoomInfo(QbarNative.QBarZoomInfo paramQBarZoomInfo, int paramInt);

  public native int SetCenterCoordinate(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);

  public final int a(int paramInt, String paramString1, String paramString2, QbarNative.QbarAiModelParam paramQbarAiModelParam)
  {
    AppMethodBeat.i(56464);
    if (this.Aqx < 0)
    {
      if (paramQbarAiModelParam != null)
        this.Aqx = Init(1, paramInt, paramString1, paramString2, paramQbarAiModelParam);
    }
    else
    {
      if (this.Aqx >= 0)
        break label62;
      paramInt = -1;
      AppMethodBeat.o(56464);
    }
    while (true)
    {
      return paramInt;
      this.Aqx = Init(1, paramInt, paramString1, paramString2);
      break;
      label62: paramInt = 0;
      AppMethodBeat.o(56464);
    }
  }

  public final List<QbarNative.QBarResult> dPR()
  {
    int i = 0;
    AppMethodBeat.i(56468);
    QbarNative.QBarResultJNI[] arrayOfQBarResultJNI = new QbarNative.QBarResultJNI[3];
    for (int j = 0; j < 3; j++)
    {
      arrayOfQBarResultJNI[j] = new QbarNative.QBarResultJNI();
      arrayOfQBarResultJNI[j].charset = new String();
      arrayOfQBarResultJNI[j].data = new byte[1024];
      arrayOfQBarResultJNI[j].typeName = new String();
    }
    GetResults(arrayOfQBarResultJNI, this.Aqx);
    ArrayList localArrayList = new ArrayList();
    j = i;
    while (j < 3)
    {
      QbarNative.QBarResultJNI localQBarResultJNI = arrayOfQBarResultJNI[j];
      try
      {
        QbarNative.QBarResult localQBarResult;
        String str;
        if (!isNullOrNil(localQBarResultJNI.typeName))
        {
          localQBarResult = new com/tencent/qbar/QbarNative$QBarResult;
          localQBarResult.<init>();
          localQBarResult.charset = localQBarResultJNI.charset;
          localQBarResult.typeID = localQBarResultJNI.typeID;
          localQBarResult.typeName = localQBarResultJNI.typeName;
          localQBarResult.rawData = localQBarResultJNI.data;
          if (!localQBarResult.charset.equals("ANY"))
            break label252;
          str = new java/lang/String;
          str.<init>(localQBarResultJNI.data, "UTF-8");
          localQBarResult.data = str;
          if (localQBarResult.data.length() == 0)
          {
            str = new java/lang/String;
            str.<init>(localQBarResultJNI.data, "ASCII");
          }
        }
        for (localQBarResult.data = str; ; localQBarResult.data = str)
        {
          localArrayList.add(localQBarResult);
          j++;
          break;
          label252: str = new java/lang/String;
          str.<init>(localQBarResultJNI.data, localQBarResult.charset);
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        new StringBuilder("GetResults exp:").append(localUnsupportedEncodingException.getMessage());
      }
    }
    AppMethodBeat.o(56468);
    return localArrayList;
  }

  public final int i(int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(56465);
    paramInt = SetReaders(paramArrayOfInt, paramInt, this.Aqx);
    AppMethodBeat.o(56465);
    return paramInt;
  }

  public final int release()
  {
    AppMethodBeat.i(56467);
    int i = Release(this.Aqx);
    this.Aqx = -1;
    AppMethodBeat.o(56467);
    return i;
  }

  public final int s(List<QbarNative.QBarResult> paramList, List<QbarNative.QBarReportMsg> paramList1)
  {
    AppMethodBeat.i(56469);
    QbarNative.QBarResultJNI[] arrayOfQBarResultJNI = new QbarNative.QBarResultJNI[3];
    Object localObject2 = new QbarNative.QBarPoint[3];
    QbarNative.QBarReportMsg[] arrayOfQBarReportMsg = new QbarNative.QBarReportMsg[3];
    for (int i = 0; i < 3; i++)
    {
      arrayOfQBarResultJNI[i] = new QbarNative.QBarResultJNI();
      arrayOfQBarResultJNI[i].charset = new String();
      arrayOfQBarResultJNI[i].data = new byte[1024];
      arrayOfQBarResultJNI[i].typeName = new String();
      localObject2[i] = new QbarNative.QBarPoint();
      arrayOfQBarReportMsg[i] = new QbarNative.QBarReportMsg();
      arrayOfQBarReportMsg[i].binaryMethod = new String();
      arrayOfQBarReportMsg[i].charsetMode = new String();
      arrayOfQBarReportMsg[i].ecLevel = new String();
      arrayOfQBarReportMsg[i].scaleList = new String();
    }
    paramList.clear();
    paramList1.clear();
    GetDetailResults(arrayOfQBarResultJNI, (QbarNative.QBarPoint[])localObject2, arrayOfQBarReportMsg, this.Aqx);
    i = 0;
    while (i < 3)
    {
      QbarNative.QBarResultJNI localQBarResultJNI = arrayOfQBarResultJNI[i];
      try
      {
        String str;
        if (!isNullOrNil(localQBarResultJNI.typeName))
        {
          localObject2 = new com/tencent/qbar/QbarNative$QBarResult;
          ((QbarNative.QBarResult)localObject2).<init>();
          ((QbarNative.QBarResult)localObject2).charset = localQBarResultJNI.charset;
          ((QbarNative.QBarResult)localObject2).typeID = localQBarResultJNI.typeID;
          ((QbarNative.QBarResult)localObject2).typeName = localQBarResultJNI.typeName;
          ((QbarNative.QBarResult)localObject2).rawData = localQBarResultJNI.data;
          if (!((QbarNative.QBarResult)localObject2).charset.equals("ANY"))
            break label361;
          str = new java/lang/String;
          str.<init>(localQBarResultJNI.data, "UTF-8");
          ((QbarNative.QBarResult)localObject2).data = str;
          if (((QbarNative.QBarResult)localObject2).data.length() == 0)
          {
            str = new java/lang/String;
            str.<init>(localQBarResultJNI.data, "ASCII");
          }
        }
        for (((QbarNative.QBarResult)localObject2).data = str; ; ((QbarNative.QBarResult)localObject2).data = str)
        {
          paramList.add(localObject2);
          i++;
          break;
          label361: str = new java/lang/String;
          str.<init>(localQBarResultJNI.data, ((QbarNative.QBarResult)localObject2).charset);
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        new StringBuilder("GetResults exp:").append(localUnsupportedEncodingException.getMessage());
      }
    }
    for (i = 0; i < 3; i++)
    {
      Object localObject1 = arrayOfQBarReportMsg[i];
      if (!isNullOrNil(localObject1.charsetMode))
        paramList1.add(localObject1);
    }
    i = paramList.size();
    AppMethodBeat.o(56469);
    return i;
  }

  public final int t(List<QbarNative.QBarCodeDetectInfo> paramList, List<QbarNative.QBarPoint> paramList1)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(56470);
    if (this.Aqx < 0)
      AppMethodBeat.o(56470);
    while (true)
    {
      return j;
      QbarNative.QBarCodeDetectInfo[] arrayOfQBarCodeDetectInfo = new QbarNative.QBarCodeDetectInfo[3];
      QbarNative.QBarPoint[] arrayOfQBarPoint = new QbarNative.QBarPoint[3];
      for (j = 0; j < 3; j++)
      {
        arrayOfQBarCodeDetectInfo[j] = new QbarNative.QBarCodeDetectInfo();
        arrayOfQBarPoint[j] = new QbarNative.QBarPoint();
      }
      paramList.clear();
      paramList1.clear();
      GetCodeDetectInfo(arrayOfQBarCodeDetectInfo, arrayOfQBarPoint, this.Aqx);
      Object localObject;
      for (int k = 0; ; k++)
      {
        j = i;
        if (k >= 3)
          break;
        localObject = arrayOfQBarCodeDetectInfo[k];
        if (((QbarNative.QBarCodeDetectInfo)localObject).readerId > 0)
          paramList.add(localObject);
      }
      while (j < 3)
      {
        localObject = arrayOfQBarPoint[j];
        if (((QbarNative.QBarPoint)localObject).point_cnt != 0)
          paramList1.add(localObject);
        j++;
      }
      j = paramList.size();
      AppMethodBeat.o(56470);
    }
  }

  public final int z(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(56466);
    ScanImage(paramArrayOfByte, paramInt1, paramInt2, 0, this.Aqx);
    if (dPR().size() > 0)
    {
      AppMethodBeat.o(56466);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = -1;
      AppMethodBeat.o(56466);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qbar.QbarNative
 * JD-Core Version:    0.6.2
 */