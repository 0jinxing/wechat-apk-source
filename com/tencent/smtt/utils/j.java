package com.tencent.smtt.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UnknownFormatConversionException;

public class j
  implements Closeable
{
  static final char[] a = { 127, 69, 76, 70, 0 };
  final char[] b;
  boolean c;
  j[] d;
  l[] e;
  byte[] f;
  private final c g;
  private final j.a h;
  private final j.k[] i;
  private byte[] j;

  public j(File paramFile)
  {
    AppMethodBeat.i(65211);
    this.b = new char[16];
    c localc = new c(paramFile);
    this.g = localc;
    localc.a(this.b);
    if (!a())
    {
      paramFile = new UnknownFormatConversionException("Invalid elf magic: ".concat(String.valueOf(paramFile)));
      AppMethodBeat.o(65211);
      throw paramFile;
    }
    localc.a(e());
    boolean bool = d();
    int k;
    label224: Object localObject;
    if (bool)
    {
      paramFile = new j.f();
      paramFile.a = localc.a();
      paramFile.b = localc.a();
      paramFile.c = localc.b();
      paramFile.k = localc.c();
      paramFile.l = localc.c();
      paramFile.m = localc.c();
      this.h = paramFile;
      paramFile = this.h;
      paramFile.d = localc.b();
      paramFile.e = localc.a();
      paramFile.f = localc.a();
      paramFile.g = localc.a();
      paramFile.h = localc.a();
      paramFile.i = localc.a();
      paramFile.j = localc.a();
      this.i = new j.k[paramFile.i];
      k = 0;
      if (k >= paramFile.i)
        break label543;
      localc.a(paramFile.a() + paramFile.h * k);
      if (!bool)
        break label432;
      localObject = new j.h();
      ((j.h)localObject).g = localc.b();
      ((j.h)localObject).h = localc.b();
      ((j.h)localObject).a = localc.c();
      ((j.h)localObject).b = localc.c();
      ((j.h)localObject).c = localc.c();
      ((j.h)localObject).d = localc.c();
      ((j.h)localObject).i = localc.b();
      ((j.h)localObject).j = localc.b();
      ((j.h)localObject).e = localc.c();
      ((j.h)localObject).f = localc.c();
      this.i[k] = localObject;
    }
    while (true)
    {
      k++;
      break label224;
      paramFile = new j.b();
      paramFile.a = localc.a();
      paramFile.b = localc.a();
      paramFile.c = localc.b();
      paramFile.k = localc.b();
      paramFile.l = localc.b();
      paramFile.m = localc.b();
      this.h = paramFile;
      break;
      label432: localObject = new j.d();
      ((j.d)localObject).g = localc.b();
      ((j.d)localObject).h = localc.b();
      ((j.d)localObject).a = localc.b();
      ((j.d)localObject).b = localc.b();
      ((j.d)localObject).c = localc.b();
      ((j.d)localObject).d = localc.b();
      ((j.d)localObject).i = localc.b();
      ((j.d)localObject).j = localc.b();
      ((j.d)localObject).e = localc.b();
      ((j.d)localObject).f = localc.b();
      this.i[k] = localObject;
    }
    label543: if ((paramFile.j >= 0) && (paramFile.j < this.i.length))
    {
      localObject = this.i[paramFile.j];
      if (((j.k)localObject).h == 3)
      {
        this.j = new byte[((j.k)localObject).a()];
        localc.a(((j.k)localObject).b());
        localc.a(this.j);
        if (this.c)
          f();
        AppMethodBeat.o(65211);
        return;
      }
      paramFile = new UnknownFormatConversionException("Wrong string section e_shstrndx=" + paramFile.j);
      AppMethodBeat.o(65211);
      throw paramFile;
    }
    paramFile = new UnknownFormatConversionException("Invalid e_shstrndx=" + paramFile.j);
    AppMethodBeat.o(65211);
    throw paramFile;
  }

  public static boolean a(File paramFile)
  {
    boolean bool = false;
    AppMethodBeat.i(65216);
    try
    {
      RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
      localRandomAccessFile.<init>(paramFile, "r");
      long l = localRandomAccessFile.readInt();
      localRandomAccessFile.close();
      if (l == 2135247942L)
      {
        bool = true;
        AppMethodBeat.o(65216);
        return bool;
      }
    }
    catch (Throwable paramFile)
    {
      while (true)
      {
        AppMethodBeat.o(65216);
        continue;
        AppMethodBeat.o(65216);
      }
    }
  }

  public static boolean b(File paramFile)
  {
    AppMethodBeat.i(65217);
    if ((g()) && (a(paramFile)));
    try
    {
      new j(paramFile);
      bool = true;
      AppMethodBeat.o(65217);
      return bool;
    }
    catch (IOException paramFile)
    {
      while (true)
      {
        new StringBuilder("checkElfFile IOException: ").append(paramFile);
        boolean bool = false;
        AppMethodBeat.o(65217);
      }
    }
    catch (UnknownFormatConversionException paramFile)
    {
      while (true)
        new StringBuilder("checkElfFile UnknownFormatConversionException: ").append(paramFile);
    }
    catch (Throwable paramFile)
    {
      while (true)
        new StringBuilder("checkElfFile Throwable: ").append(paramFile);
    }
  }

  private void f()
  {
    AppMethodBeat.i(65212);
    j.a locala = this.h;
    c localc = this.g;
    boolean bool = d();
    j.k localk = a(".dynsym");
    Object localObject1;
    if (localk != null)
    {
      localc.a(localk.b());
      int k = localk.a();
      label83: Object localObject2;
      if (bool)
      {
        m = 24;
        k /= m;
        this.e = new l[k];
        localObject1 = new char[1];
        m = 0;
        if (m >= k)
          break label286;
        if (!bool)
          break label195;
        localObject2 = new i();
        ((i)localObject2).c = localc.b();
        localc.a((char[])localObject1);
        ((i)localObject2).d = ((char)localObject1[0]);
        localc.a((char[])localObject1);
        ((i)localObject2).e = ((char)localObject1[0]);
        ((i)localObject2).a = localc.c();
        ((i)localObject2).b = localc.c();
        ((i)localObject2).f = localc.a();
        this.e[m] = localObject2;
      }
      while (true)
      {
        m++;
        break label83;
        m = 16;
        break;
        label195: localObject2 = new j.e();
        ((j.e)localObject2).c = localc.b();
        ((j.e)localObject2).a = localc.b();
        ((j.e)localObject2).b = localc.b();
        localc.a((char[])localObject1);
        ((j.e)localObject2).d = ((char)localObject1[0]);
        localc.a((char[])localObject1);
        ((j.e)localObject2).e = ((char)localObject1[0]);
        ((j.e)localObject2).f = localc.a();
        this.e[m] = localObject2;
      }
      label286: localObject1 = this.i[localk.i];
      localc.a(((j.k)localObject1).b());
      this.f = new byte[((j.k)localObject1).a()];
      localc.a(this.f);
    }
    this.d = new j[locala.g];
    int m = 0;
    if (m < locala.g)
    {
      localc.a(locala.b() + locala.f * m);
      if (bool)
      {
        localObject1 = new j.g();
        ((j.g)localObject1).g = localc.b();
        ((j.g)localObject1).h = localc.b();
        ((j.g)localObject1).a = localc.c();
        ((j.g)localObject1).b = localc.c();
        ((j.g)localObject1).c = localc.c();
        ((j.g)localObject1).d = localc.c();
        ((j.g)localObject1).e = localc.c();
        ((j.g)localObject1).f = localc.c();
        this.d[m] = localObject1;
      }
      while (true)
      {
        m++;
        break;
        localObject1 = new j.c();
        ((j.c)localObject1).g = localc.b();
        ((j.c)localObject1).h = localc.b();
        ((j.c)localObject1).a = localc.b();
        ((j.c)localObject1).b = localc.b();
        ((j.c)localObject1).c = localc.b();
        ((j.c)localObject1).d = localc.b();
        ((j.c)localObject1).e = localc.b();
        ((j.c)localObject1).f = localc.b();
        this.d[m] = localObject1;
      }
    }
    AppMethodBeat.o(65212);
  }

  private static boolean g()
  {
    AppMethodBeat.i(65218);
    String str = System.getProperty("java.vm.version");
    boolean bool;
    if ((str != null) && (str.startsWith("2")))
    {
      bool = true;
      AppMethodBeat.o(65218);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65218);
    }
  }

  public final j.k a(String paramString)
  {
    AppMethodBeat.i(65213);
    j.k[] arrayOfk = this.i;
    int k = arrayOfk.length;
    int m = 0;
    if (m < k)
    {
      j.k localk = arrayOfk[m];
      if (paramString.equals(a(localk.g)))
      {
        AppMethodBeat.o(65213);
        paramString = localk;
      }
    }
    while (true)
    {
      return paramString;
      m++;
      break;
      paramString = null;
      AppMethodBeat.o(65213);
    }
  }

  public final String a(int paramInt)
  {
    AppMethodBeat.i(65214);
    String str;
    if (paramInt == 0)
    {
      str = "SHN_UNDEF";
      AppMethodBeat.o(65214);
    }
    while (true)
    {
      return str;
      for (int k = paramInt; this.j[k] != 0; k++);
      str = new String(this.j, paramInt, k - paramInt);
      AppMethodBeat.o(65214);
    }
  }

  final boolean a()
  {
    boolean bool = false;
    if (this.b[0] == a[0])
      bool = true;
    return bool;
  }

  final char b()
  {
    return this.b[4];
  }

  final char c()
  {
    return this.b[5];
  }

  public void close()
  {
    AppMethodBeat.i(65215);
    this.g.close();
    AppMethodBeat.o(65215);
  }

  public final boolean d()
  {
    AppMethodBeat.i(65209);
    boolean bool;
    if (b() == '\002')
    {
      bool = true;
      AppMethodBeat.o(65209);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65209);
    }
  }

  public final boolean e()
  {
    boolean bool = true;
    AppMethodBeat.i(65210);
    if (c() == '\001')
      AppMethodBeat.o(65210);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65210);
    }
  }

  static class i extends j.l
  {
    long a;
    long b;
  }

  static abstract class j
  {
    int g;
    int h;
  }

  static abstract class l
  {
    int c;
    char d;
    char e;
    short f;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.j
 * JD-Core Version:    0.6.2
 */