package com.tencent.tmassistantsdk.protocol.jce;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class Request extends JceStruct
  implements Cloneable
{
  private static final String TAG = "Request";
  static byte[] cache_body;
  static ReqHead cache_head;
  public byte[] body = null;
  public ReqHead head = null;

  static
  {
    AppMethodBeat.i(76105);
    if (!Request.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(76105);
      return;
    }
  }

  public Request()
  {
  }

  public Request(ReqHead paramReqHead, byte[] paramArrayOfByte)
  {
    this.head = paramReqHead;
    this.body = paramArrayOfByte;
  }

  public final String className()
  {
    return "jce.Request";
  }

  public final Object clone()
  {
    AppMethodBeat.i(76100);
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
      AppMethodBeat.o(76100);
      return localObject1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while ($assertionsDisabled);
      localObject1 = new AssertionError();
      AppMethodBeat.o(76100);
    }
    throw ((Throwable)localObject1);
  }

  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    AppMethodBeat.i(76103);
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.head, "head");
    paramStringBuilder.display(this.body, "body");
    AppMethodBeat.o(76103);
  }

  public final void displaySimple(StringBuilder paramStringBuilder, int paramInt)
  {
    AppMethodBeat.i(76104);
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.displaySimple(this.head, true);
    paramStringBuilder.displaySimple(this.body, false);
    AppMethodBeat.o(76104);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(76098);
    if (paramObject == null)
      AppMethodBeat.o(76098);
    while (true)
    {
      return bool;
      paramObject = (Request)paramObject;
      if ((JceUtil.equals(this.head, paramObject.head)) && (JceUtil.equals(this.body, paramObject.body)))
      {
        bool = true;
        AppMethodBeat.o(76098);
      }
      else
      {
        AppMethodBeat.o(76098);
      }
    }
  }

  public final String fullClassName()
  {
    return "Request";
  }

  public final byte[] getBody()
  {
    return this.body;
  }

  public final ReqHead getHead()
  {
    return this.head;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(76099);
    try
    {
      Exception localException1 = new java/lang/Exception;
      localException1.<init>("Need define key first!");
      AppMethodBeat.o(76099);
      throw localException1;
    }
    catch (Exception localException2)
    {
      ab.printErrStackTrace("Request", localException2, "", new Object[0]);
      AppMethodBeat.o(76099);
    }
    return 0;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(76102);
    if (cache_head == null)
      cache_head = new ReqHead();
    this.head = ((ReqHead)paramJceInputStream.read(cache_head, 0, true));
    if (cache_body == null)
    {
      byte[] arrayOfByte = (byte[])new byte[1];
      cache_body = arrayOfByte;
      ((byte[])arrayOfByte)[0] = ((byte)0);
    }
    this.body = ((byte[])paramJceInputStream.read(cache_body, 1, false));
    AppMethodBeat.o(76102);
  }

  public final void setBody(byte[] paramArrayOfByte)
  {
    this.body = paramArrayOfByte;
  }

  public final void setHead(ReqHead paramReqHead)
  {
    this.head = paramReqHead;
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(76101);
    paramJceOutputStream.write(this.head, 0);
    if (this.body != null)
      paramJceOutputStream.write(this.body, 1);
    AppMethodBeat.o(76101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.protocol.jce.Request
 * JD-Core Version:    0.6.2
 */