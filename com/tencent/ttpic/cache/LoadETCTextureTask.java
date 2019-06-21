package com.tencent.ttpic.cache;

import android.opengl.ETC1Util.ETC1Texture;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.etc.ETC1File;
import com.tencent.ttpic.util.ZipPkmReader;
import java.io.File;
import java.util.Map;

public class LoadETCTextureTask extends AsyncTask<Void, Integer, Boolean>
{
  private Map<String, ETC1Util.ETC1Texture> cache;
  private String dataPath;
  private final int frames;
  private final String id;
  private final String materialId;

  public LoadETCTextureTask(Map<String, ETC1Util.ETC1Texture> paramMap, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    this.cache = paramMap;
    this.dataPath = paramString2;
    this.materialId = paramString3;
    this.id = paramString1;
    this.frames = paramInt;
  }

  private void fillCache(int paramInt, String paramString)
  {
    AppMethodBeat.i(81785);
    for (int i = 0; i < paramInt; i++)
    {
      String str1 = this.id + "_" + String.format(new StringBuilder("%0").append(LoadETCItemManager.FORMAT_COUNT).append("d").toString(), new Object[] { Integer.valueOf(i) }) + paramString;
      str1 = this.materialId + File.separator + str1;
      if (!this.cache.containsKey(str1))
      {
        int j = i;
        while ((!this.cache.containsKey(str1)) && (j > 0))
        {
          j--;
          str1 = this.id + "_" + String.format(new StringBuilder("%0").append(LoadETCItemManager.FORMAT_COUNT).append("d").toString(), new Object[] { Integer.valueOf(j) }) + paramString;
          str1 = this.materialId + File.separator + str1;
        }
        if (this.cache.containsKey(str1))
        {
          String str2 = this.id + "_" + String.format(new StringBuilder("%0").append(LoadETCItemManager.FORMAT_COUNT).append("d").toString(), new Object[] { Integer.valueOf(i) }) + paramString;
          str2 = this.materialId + File.separator + str2;
          this.cache.put(str2, this.cache.get(str1));
        }
      }
    }
    AppMethodBeat.o(81785);
  }

  protected Boolean doInBackground(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(81784);
    if (this.cache == null)
    {
      paramArrayOfVoid = Boolean.FALSE;
      AppMethodBeat.o(81784);
    }
    while (true)
    {
      return paramArrayOfVoid;
      paramArrayOfVoid = new ZipPkmReader(this.dataPath);
      paramArrayOfVoid.open();
      while (true)
      {
        ETC1File localETC1File = paramArrayOfVoid.getNextEntry();
        if (localETC1File == null)
          break label117;
        if (isCancelled())
        {
          paramArrayOfVoid = Boolean.FALSE;
          AppMethodBeat.o(81784);
          break;
        }
        String str = this.materialId + File.separator + localETC1File.getName();
        this.cache.put(str, localETC1File.getTexutre());
      }
      label117: paramArrayOfVoid.close();
      fillCache(this.frames, ".pkm");
      fillCache(this.frames, "_alpha.pkm");
      paramArrayOfVoid = Boolean.TRUE;
      AppMethodBeat.o(81784);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.LoadETCTextureTask
 * JD-Core Version:    0.6.2
 */