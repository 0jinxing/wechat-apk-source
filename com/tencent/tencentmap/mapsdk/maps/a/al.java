package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;

public final class al
{
  private static HashMap<String, byte[]> e = null;
  private HashMap<String, byte[]> a;
  private ai b;
  private String c;
  private am d;

  public al()
  {
    AppMethodBeat.i(98467);
    this.a = new HashMap();
    this.b = new ai();
    this.c = "GBK";
    this.d = new am();
    AppMethodBeat.o(98467);
  }

  public final void a()
  {
    this.d.b = 1;
  }

  public final void a(String paramString)
  {
    this.d.d = paramString;
  }

  public final <T> void a(String paramString, T paramT)
  {
    AppMethodBeat.i(98468);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("put key can not is null");
      AppMethodBeat.o(98468);
      throw paramString;
    }
    if (paramT == null)
    {
      paramString = new IllegalArgumentException("put value can not is null");
      AppMethodBeat.o(98468);
      throw paramString;
    }
    if ((paramT instanceof Set))
    {
      paramString = new IllegalArgumentException("can not support Set");
      AppMethodBeat.o(98468);
      throw paramString;
    }
    Object localObject = new aj();
    ((aj)localObject).a(this.c);
    ((aj)localObject).a(paramT, 0);
    localObject = ((aj)localObject).a();
    paramT = new byte[((ByteBuffer)localObject).position()];
    System.arraycopy(((ByteBuffer)localObject).array(), 0, paramT, 0, paramT.length);
    this.a.put(paramString, paramT);
    AppMethodBeat.o(98468);
  }

  public final void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98470);
    if (paramArrayOfByte.length < 4)
    {
      paramArrayOfByte = new IllegalArgumentException("decode package must include size head");
      AppMethodBeat.o(98470);
      throw paramArrayOfByte;
    }
    try
    {
      Object localObject = new com/tencent/tencentmap/mapsdk/maps/a/ai;
      ((ai)localObject).<init>(paramArrayOfByte, (byte)0);
      ((ai)localObject).a(this.c);
      this.d.a((ai)localObject);
      paramArrayOfByte = new com/tencent/tencentmap/mapsdk/maps/a/ai;
      paramArrayOfByte.<init>(this.d.e);
      paramArrayOfByte.a(this.c);
      if (e == null)
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
        e = (HashMap)localObject;
        ((HashMap)localObject).put("", new byte[0]);
      }
      this.a = paramArrayOfByte.a(e);
      AppMethodBeat.o(98470);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte = new RuntimeException(paramArrayOfByte);
      AppMethodBeat.o(98470);
    }
    throw paramArrayOfByte;
  }

  public final <T> T b(String paramString, T paramT)
  {
    AppMethodBeat.i(98471);
    if (!this.a.containsKey(paramString))
    {
      paramString = null;
      AppMethodBeat.o(98471);
    }
    while (true)
    {
      return paramString;
      paramString = (byte[])this.a.get(paramString);
      try
      {
        this.b.a(paramString);
        this.b.a(this.c);
        paramString = this.b.a(paramT, 0, true);
        AppMethodBeat.o(98471);
      }
      catch (Exception paramString)
      {
        paramString = new Exception(paramString);
        AppMethodBeat.o(98471);
      }
    }
    throw paramString;
  }

  public final void b(String paramString)
  {
    this.d.c = paramString;
  }

  public final byte[] b()
  {
    AppMethodBeat.i(98469);
    Object localObject1 = new aj(0);
    ((aj)localObject1).a(this.c);
    ((aj)localObject1).a(this.a, 0);
    this.d.a = ((short)3);
    Object localObject2 = this.d;
    ByteBuffer localByteBuffer = ((aj)localObject1).a();
    localObject1 = new byte[localByteBuffer.position()];
    System.arraycopy(localByteBuffer.array(), 0, localObject1, 0, localObject1.length);
    ((am)localObject2).e = ((byte[])localObject1);
    localObject2 = new aj(0);
    ((aj)localObject2).a(this.c);
    this.d.a((aj)localObject2);
    localObject1 = ((aj)localObject2).a();
    localObject2 = new byte[((ByteBuffer)localObject1).position()];
    System.arraycopy(((ByteBuffer)localObject1).array(), 0, localObject2, 0, localObject2.length);
    int i = localObject2.length;
    localObject1 = ByteBuffer.allocate(i + 4);
    ((ByteBuffer)localObject1).putInt(i + 4).put((byte[])localObject2).flip();
    localObject2 = ((ByteBuffer)localObject1).array();
    AppMethodBeat.o(98469);
    return localObject2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.al
 * JD-Core Version:    0.6.2
 */