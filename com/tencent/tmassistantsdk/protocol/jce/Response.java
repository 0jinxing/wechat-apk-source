package com.tencent.tmassistantsdk.protocol.jce;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class Response extends JceStruct
  implements Cloneable
{
  private static final String TAG = "Response";
  static byte[] cache_body;
  static RspHead cache_head;
  public byte[] body = null;
  public RspHead head = null;

  static
  {
    AppMethodBeat.i(76113);
    if (!Response.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(76113);
      return;
    }
  }

  public Response()
  {
  }

  public Response(RspHead paramRspHead, byte[] paramArrayOfByte)
  {
    this.head = paramRspHead;
    this.body = paramArrayOfByte;
  }

  public final String className()
  {
    return "jce.Response";
  }

  public final Object clone()
  {
    AppMethodBeat.i(76108);
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
      AppMethodBeat.o(76108);
      return localObject1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while ($assertionsDisabled);
      localObject1 = new AssertionError();
      AppMethodBeat.o(76108);
    }
    throw ((Throwable)localObject1);
  }

  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    AppMethodBeat.i(76111);
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.head, "head");
    paramStringBuilder.display(this.body, "body");
    AppMethodBeat.o(76111);
  }

  public final void displaySimple(StringBuilder paramStringBuilder, int paramInt)
  {
    AppMethodBeat.i(76112);
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.displaySimple(this.head, true);
    paramStringBuilder.displaySimple(this.body, false);
    AppMethodBeat.o(76112);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(76106);
    if (paramObject == null)
      AppMethodBeat.o(76106);
    while (true)
    {
      return bool;
      paramObject = (Response)paramObject;
      if ((JceUtil.equals(this.head, paramObject.head)) && (JceUtil.equals(this.body, paramObject.body)))
      {
        bool = true;
        AppMethodBeat.o(76106);
      }
      else
      {
        AppMethodBeat.o(76106);
      }
    }
  }

  public final String fullClassName()
  {
    return "Response";
  }

  public final byte[] getBody()
  {
    return this.body;
  }

  public final RspHead getHead()
  {
    return this.head;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(76107);
    try
    {
      Exception localException1 = new java/lang/Exception;
      localException1.<init>("Need define key first!");
      AppMethodBeat.o(76107);
      throw localException1;
    }
    catch (Exception localException2)
    {
      ab.printErrStackTrace("Response", localException2, "", new Object[0]);
      AppMethodBeat.o(76107);
    }
    return 0;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(76110);
    if (cache_head == null)
      cache_head = new RspHead();
    this.head = ((RspHead)paramJceInputStream.read(cache_head, 0, true));
    if (cache_body == null)
    {
      byte[] arrayOfByte = (byte[])new byte[1];
      cache_body = arrayOfByte;
      ((byte[])arrayOfByte)[0] = ((byte)0);
    }
    this.body = ((byte[])paramJceInputStream.read(cache_body, 1, true));
    AppMethodBeat.o(76110);
  }

  public final void setBody(byte[] paramArrayOfByte)
  {
    this.body = paramArrayOfByte;
  }

  public final void setHead(RspHead paramRspHead)
  {
    this.head = paramRspHead;
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(76109);
    paramJceOutputStream.write(this.head, 0);
    paramJceOutputStream.write(this.body, 1);
    AppMethodBeat.o(76109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.protocol.jce.Response
 * JD-Core Version:    0.6.2
 */