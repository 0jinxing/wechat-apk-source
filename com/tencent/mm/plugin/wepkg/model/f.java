package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

public final class f
{
  private String charset;
  public WepkgVersion uWY;
  private e uXi;
  private Map<String, WepkgPreloadFile> uXj;

  public f(WepkgVersion paramWepkgVersion, e parame, Map<String, WepkgPreloadFile> paramMap)
  {
    AppMethodBeat.i(63547);
    this.charset = "UTF-8";
    this.uWY = paramWepkgVersion;
    this.uXi = parame;
    this.uXj = paramMap;
    if ((paramWepkgVersion != null) && (!bo.isNullOrNil(paramWepkgVersion.charset)))
      this.charset = paramWepkgVersion.charset;
    AppMethodBeat.o(63547);
  }

  public final String Kl(String paramString)
  {
    AppMethodBeat.i(63550);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(63550);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if ((this.uXj != null) && (this.uXj.get(paramString) != null))
      {
        paramString = (WepkgPreloadFile)this.uXj.get(paramString);
        if (!bo.isNullOrNil(paramString.filePath))
        {
          File localFile = new File(paramString.filePath);
          if ((localFile.exists()) && (localFile.isFile()) && (localFile.length() == paramString.size))
          {
            paramString = paramString.filePath;
            AppMethodBeat.o(63550);
          }
        }
      }
      else
      {
        AppMethodBeat.o(63550);
        paramString = null;
      }
    }
  }

  public final o ahS(String paramString)
  {
    AppMethodBeat.i(63549);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(63549);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if ((this.uXj != null) && (this.uXj.get(paramString) != null))
      {
        WepkgPreloadFile localWepkgPreloadFile = (WepkgPreloadFile)this.uXj.get(paramString);
        if (!bo.isNullOrNil(localWepkgPreloadFile.filePath))
        {
          Object localObject = new File(localWepkgPreloadFile.filePath);
          if ((((File)localObject).exists()) && (((File)localObject).isFile()) && (((File)localObject).length() == localWepkgPreloadFile.size))
            try
            {
              ab.i("MicroMsg.Wepkg.WepkgInterceptor", "rid hit preload file. rid:%s, localPath:%s", new Object[] { paramString, localWepkgPreloadFile.filePath });
              FileInputStream localFileInputStream = new java/io/FileInputStream;
              localFileInputStream.<init>((File)localObject);
              localObject = new com/tencent/xweb/o;
              ((o)localObject).<init>(localWepkgPreloadFile.mimeType, this.charset, localFileInputStream);
              AppMethodBeat.o(63549);
              paramString = (String)localObject;
            }
            catch (FileNotFoundException localFileNotFoundException)
            {
            }
        }
      }
      else if (this.uXi != null)
      {
        paramString = this.uXi.hy(paramString, this.charset);
        AppMethodBeat.o(63549);
      }
      else
      {
        AppMethodBeat.o(63549);
        paramString = null;
      }
    }
  }

  public final boolean ahT(String paramString)
  {
    AppMethodBeat.i(63548);
    boolean bool;
    if (ahS(d.aif(paramString)) != null)
    {
      bool = true;
      AppMethodBeat.o(63548);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63548);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.f
 * JD-Core Version:    0.6.2
 */