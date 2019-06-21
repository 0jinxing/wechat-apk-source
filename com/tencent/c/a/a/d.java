package com.tencent.c.a.a;

import android.content.Context;
import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

final class d extends q
{
  d(Context paramContext)
  {
    super(paramContext);
  }

  protected final void a(a parama)
  {
  }

  protected final String read()
  {
    AppMethodBeat.i(125719);
    try
    {
      s.zX();
      Object localObject1 = new java/io/File;
      ((File)localObject1).<init>(Environment.getExternalStorageDirectory(), s.decode("6X8Y4XdM2Vhvn0KfzcEatGnWaNU="));
      try
      {
        Object localObject4 = c.s((File)localObject1).iterator();
        boolean bool = ((Iterator)localObject4).hasNext();
        if (!bool);
        for (localObject1 = null; ; localObject1 = localObject1[1])
        {
          return localObject1;
          localObject1 = ((String)((Iterator)localObject4).next()).split(",");
          if ((localObject1.length != 2) || (!localObject1[0].equals(s.decode("4kU71lN96TJUomD1vOU9lgj9Tw=="))))
            break;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("read mid from InternalStorage:");
          ((StringBuilder)localObject4).append(localObject1[1]);
          s.zX();
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          s.zY();
          Object localObject2 = null;
        }
      }
    }
    finally
    {
      AppMethodBeat.o(125719);
    }
  }

  protected final void write(String paramString)
  {
    AppMethodBeat.i(125720);
    try
    {
      s.zX();
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      c.cl(Environment.getExternalStorageDirectory() + "/" + s.decode("6X8Y4XdM2Vhvn0I="));
      Object localObject2 = new java/io/File;
      ((File)localObject2).<init>(Environment.getExternalStorageDirectory(), s.decode("6X8Y4XdM2Vhvn0KfzcEatGnWaNU="));
      try
      {
        localObject1 = new java/io/FileWriter;
        ((FileWriter)localObject1).<init>((File)localObject2);
        localObject2 = new java/io/BufferedWriter;
        ((BufferedWriter)localObject2).<init>((Writer)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>(String.valueOf(s.decode("4kU71lN96TJUomD1vOU9lgj9Tw==")));
        ((BufferedWriter)localObject2).write("," + paramString);
        ((BufferedWriter)localObject2).write("\n");
        ((BufferedWriter)localObject2).close();
        return;
      }
      catch (Exception paramString)
      {
        while (true)
          s.zY();
      }
    }
    finally
    {
      AppMethodBeat.o(125720);
    }
    throw paramString;
  }

  protected final boolean zO()
  {
    AppMethodBeat.i(125718);
    boolean bool;
    if ((s.q(this.context, "android.permission.WRITE_EXTERNAL_STORAGE")) && (Environment.getExternalStorageState().equals("mounted")))
    {
      bool = true;
      AppMethodBeat.o(125718);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125718);
    }
  }

  protected final a zP()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.d
 * JD-Core Version:    0.6.2
 */