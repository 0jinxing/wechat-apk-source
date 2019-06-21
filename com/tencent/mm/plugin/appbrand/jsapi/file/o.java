package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONObject;

public final class o extends a
{
  private static final int CTRL_INDEX = 278;
  private static final String NAME = "getFileInfo";

  static String H(File paramFile)
  {
    AppMethodBeat.i(102786);
    try
    {
      localMessageDigest = MessageDigest.getInstance("SHA1");
    }
    catch (NoSuchAlgorithmException paramFile)
    {
      try
      {
        localFileInputStream = new java/io/FileInputStream;
        localFileInputStream.<init>(paramFile);
        paramFile = new byte[8192];
      }
      catch (FileNotFoundException paramFile)
      {
        try
        {
          while (true)
          {
            int i = localFileInputStream.read(paramFile);
            if (i <= 0)
              break;
            localMessageDigest.update(paramFile, 0, i);
          }
        }
        catch (IOException paramFile)
        {
          MessageDigest localMessageDigest;
          FileInputStream localFileInputStream;
          paramFile = paramFile;
          paramFile = "";
          try
          {
            localFileInputStream.close();
            AppMethodBeat.o(102786);
            while (true)
            {
              return paramFile;
              paramFile = paramFile;
              ab.e("MicroMsg.JsApiGetFileInfo", "Exception while getting Digest", new Object[] { paramFile });
              paramFile = "";
              AppMethodBeat.o(102786);
              continue;
              paramFile = paramFile;
              ab.e("MicroMsg.JsApiGetFileInfo", "Exception while getting FileInputStream", new Object[] { paramFile });
              paramFile = "";
              AppMethodBeat.o(102786);
              continue;
              paramFile = bytesToHexString(localMessageDigest.digest());
              try
              {
                localFileInputStream.close();
                AppMethodBeat.o(102786);
              }
              catch (IOException localIOException1)
              {
                while (true)
                  ab.e("MicroMsg.JsApiGetFileInfo", "Exception on closing MD5 input stream", new Object[] { localIOException1 });
              }
            }
          }
          catch (IOException localIOException2)
          {
            while (true)
              ab.e("MicroMsg.JsApiGetFileInfo", "Exception on closing MD5 input stream", new Object[] { localIOException2 });
          }
        }
        finally
        {
        }
      }
    }
    try
    {
      localIOException2.close();
      AppMethodBeat.o(102786);
      throw paramFile;
    }
    catch (IOException localIOException3)
    {
      while (true)
        ab.e("MicroMsg.JsApiGetFileInfo", "Exception on closing MD5 input stream", new Object[] { localIOException3 });
    }
  }

  private static String bytesToHexString(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102787);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(102787);
    }
    while (true)
    {
      return paramArrayOfByte;
      StringBuffer localStringBuffer = new StringBuffer(paramArrayOfByte.length);
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
        if (str.length() < 2)
          localStringBuffer.append(0);
        localStringBuffer.append(str.toLowerCase());
      }
      paramArrayOfByte = localStringBuffer.toString();
      AppMethodBeat.o(102787);
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(102785);
    String str = paramJSONObject.optString("filePath", "");
    if (!"sha1".equalsIgnoreCase(paramJSONObject.optString("digestAlgorithm", "md5")))
    {
      paramJSONObject = "md5";
      if (!bo.isNullOrNil(str))
        break label68;
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(102785);
    }
    while (true)
    {
      return;
      paramJSONObject = "sha1";
      break;
      label68: d.post(new o.1(this, paramc, str, paramInt, paramJSONObject), "AppBrandJsApiGetFileInfo");
      AppMethodBeat.o(102785);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.o
 * JD-Core Version:    0.6.2
 */