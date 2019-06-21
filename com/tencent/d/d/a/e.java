package com.tencent.d.d.a;

import android.text.TextUtils;
import com.tencent.d.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public final class e
{
  public static boolean dQm()
  {
    boolean bool = true;
    AppMethodBeat.i(114509);
    try
    {
      Object localObject1 = System.getenv("PATH");
      int j;
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        Object localObject2 = ((String)localObject1).split(":");
        int i = localObject2.length;
        j = 0;
        if (j >= i)
          break label160;
        String str = localObject2[j];
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(str, "su");
        if (((File)localObject1).exists())
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("SuFile found : ");
          ((StringBuilder)localObject2).append(((File)localObject1).toString());
          h.dQG();
          AppMethodBeat.o(114509);
        }
      }
      while (true)
      {
        return bool;
        j++;
        break;
        localObject1 = new java/io/File;
        ((File)localObject1).<init>("/system/bin/su");
        if (((File)localObject1).exists())
        {
          h.dQG();
          AppMethodBeat.o(114509);
        }
        else
        {
          localObject1 = new java/io/File;
          ((File)localObject1).<init>("/system/xbin/su");
          if (!((File)localObject1).exists())
            break label160;
          h.dQG();
          AppMethodBeat.o(114509);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        h.w(localThrowable);
        label160: h.dQG();
        AppMethodBeat.o(114509);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.a.e
 * JD-Core Version:    0.6.2
 */