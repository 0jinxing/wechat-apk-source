package com.tencent.map.lib.gl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.hi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

public class b
{
  private int a;
  private hi<String> b;
  private Hashtable<String, Integer> c;
  private IntBuffer d;

  public b(int paramInt)
  {
    AppMethodBeat.i(98046);
    this.a = paramInt;
    this.b = new hi(paramInt);
    this.c = new Hashtable();
    b();
    AppMethodBeat.o(98046);
  }

  private void b()
  {
    AppMethodBeat.i(98047);
    if (this.d == null)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(this.a * 4);
      localByteBuffer.order(ByteOrder.nativeOrder());
      this.d = localByteBuffer.asIntBuffer();
    }
    AppMethodBeat.o(98047);
  }

  public int a(String paramString)
  {
    try
    {
      AppMethodBeat.i(98049);
      paramString = (Integer)this.c.get(paramString);
      int i;
      if (paramString != null)
      {
        i = paramString.intValue();
        AppMethodBeat.o(98049);
      }
      while (true)
      {
        return i;
        i = 0;
        AppMethodBeat.o(98049);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public void a()
  {
    try
    {
      AppMethodBeat.i(98051);
      this.c.clear();
      this.b.b();
      if (this.d != null)
        this.d.clear();
      AppMethodBeat.o(98051);
      return;
    }
    finally
    {
    }
  }

  public void a(String paramString, int paramInt)
  {
    try
    {
      AppMethodBeat.i(98048);
      if (this.c.size() == this.a)
      {
        b();
        if (this.d == null)
          AppMethodBeat.o(98048);
      }
      while (true)
      {
        return;
        Object localObject = (String)this.b.a();
        localObject = (Integer)this.c.remove(localObject);
        if (this.d.position() < this.a)
          this.d.put(((Integer)localObject).intValue());
        this.b.a(paramString);
        this.c.put(paramString, Integer.valueOf(paramInt));
        AppMethodBeat.o(98048);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public void a(GL10 paramGL10)
  {
    try
    {
      AppMethodBeat.i(98050);
      if (this.d == null)
        AppMethodBeat.o(98050);
      while (true)
      {
        return;
        int i = this.d.position();
        if (i > 0)
        {
          this.d.rewind();
          paramGL10.glDeleteTextures(i, this.d);
          this.d.clear();
        }
        AppMethodBeat.o(98050);
      }
    }
    finally
    {
    }
    throw paramGL10;
  }

  public void b(GL10 paramGL10)
  {
    try
    {
      AppMethodBeat.i(98052);
      if (this.d == null)
        break label85;
      Iterator localIterator = this.c.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        int i = ((Integer)this.c.get(str)).intValue();
        this.d.put(i);
      }
    }
    finally
    {
    }
    a(paramGL10);
    label85: this.c.clear();
    this.b.b();
    AppMethodBeat.o(98052);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.b
 * JD-Core Version:    0.6.2
 */