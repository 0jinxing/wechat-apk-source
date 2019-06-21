package com.tencent.ttpic.util;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.raw.FilterRawGet.GetInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterUtils$FiltersGetInputStream
  implements FilterRawGet.GetInputStream
{
  public InputStream getInputStream(String paramString)
  {
    AppMethodBeat.i(83911);
    Object localObject = ResourcePathMapper.getFilterResPath(paramString);
    if (localObject == null);
    try
    {
      localObject = VideoGlobalContext.getContext().getAssets();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("raw");
      paramString = ((AssetManager)localObject).open(File.separator + paramString);
      while (true)
      {
        return paramString;
        if (((String)localObject).startsWith("assets://"))
        {
          paramString = ((String)localObject).substring(((String)localObject).lastIndexOf("assets://") + 9);
          paramString = VideoGlobalContext.getContext().getAssets().open(paramString);
        }
        else
        {
          paramString = new java/io/File;
          paramString.<init>((String)localObject);
          paramString = new FileInputStream(paramString);
        }
      }
    }
    catch (IOException paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(83911);
      }
    }
    finally
    {
      AppMethodBeat.o(83911);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.FilterUtils.FiltersGetInputStream
 * JD-Core Version:    0.6.2
 */