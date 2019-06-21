package com.tencent.mm.vfs;

import android.os.CancellationSignal;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractFileSystem
  implements FileSystem
{
  private String zYy;
  private a zYz;

  public void a(CancellationSignal paramCancellationSignal)
  {
  }

  public final void a(String paramString, a parama)
  {
    try
    {
      this.zYy = paramString;
      this.zYz = parama;
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  protected final void j(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length == 0);
    Object localObject2;
    for (paramArrayOfObject = null; ; paramArrayOfObject = (Object[])localObject2)
      try
      {
        Object localObject1 = this.zYy;
        localObject2 = this.zYz;
        if (localObject2 != null)
          ((a)localObject2).b((String)localObject1, paramInt, paramArrayOfObject);
        return;
        localObject2 = new HashMap(paramArrayOfObject.length / 2);
        int i = 0;
        while (i < paramArrayOfObject.length - 1)
        {
          int j = i + 1;
          Object localObject3 = paramArrayOfObject[i];
          if (j >= paramArrayOfObject.length)
            break;
          i = j + 1;
          localObject1 = paramArrayOfObject[j];
          ((Map)localObject2).put(localObject3.toString(), localObject1);
        }
      }
      finally
      {
      }
  }

  public void p(Map<String, String> paramMap)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.AbstractFileSystem
 * JD-Core Version:    0.6.2
 */