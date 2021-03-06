package com.tencent.tmassistantsdk.protocol.jce;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class Net extends JceStruct
  implements Cloneable
{
  private static final String TAG = "Net";
  public String extNetworkOperator = "";
  public int extNetworkType = 0;
  public byte isWap = (byte)0;
  public byte netType = (byte)0;

  static
  {
    AppMethodBeat.i(76073);
    if (!Net.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(76073);
      return;
    }
  }

  public Net()
  {
  }

  public Net(byte paramByte1, String paramString, int paramInt, byte paramByte2)
  {
    this.netType = ((byte)paramByte1);
    this.extNetworkOperator = paramString;
    this.extNetworkType = paramInt;
    this.isWap = ((byte)paramByte2);
  }

  public final String className()
  {
    return "jce.Net";
  }

  public final Object clone()
  {
    AppMethodBeat.i(76068);
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
      AppMethodBeat.o(76068);
      return localObject1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while ($assertionsDisabled);
      localObject1 = new AssertionError();
      AppMethodBeat.o(76068);
    }
    throw ((Throwable)localObject1);
  }

  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    AppMethodBeat.i(76071);
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.netType, "netType");
    paramStringBuilder.display(this.extNetworkOperator, "extNetworkOperator");
    paramStringBuilder.display(this.extNetworkType, "extNetworkType");
    paramStringBuilder.display(this.isWap, "isWap");
    AppMethodBeat.o(76071);
  }

  public final void displaySimple(StringBuilder paramStringBuilder, int paramInt)
  {
    AppMethodBeat.i(76072);
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.displaySimple(this.netType, true);
    paramStringBuilder.displaySimple(this.extNetworkOperator, true);
    paramStringBuilder.displaySimple(this.extNetworkType, true);
    paramStringBuilder.displaySimple(this.isWap, false);
    AppMethodBeat.o(76072);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(76066);
    if (paramObject == null)
      AppMethodBeat.o(76066);
    while (true)
    {
      return bool;
      paramObject = (Net)paramObject;
      if ((JceUtil.equals(this.netType, paramObject.netType)) && (JceUtil.equals(this.extNetworkOperator, paramObject.extNetworkOperator)) && (JceUtil.equals(this.extNetworkType, paramObject.extNetworkType)) && (JceUtil.equals(this.isWap, paramObject.isWap)))
      {
        bool = true;
        AppMethodBeat.o(76066);
      }
      else
      {
        AppMethodBeat.o(76066);
      }
    }
  }

  public final String fullClassName()
  {
    return "Net";
  }

  public final String getExtNetworkOperator()
  {
    return this.extNetworkOperator;
  }

  public final int getExtNetworkType()
  {
    return this.extNetworkType;
  }

  public final byte getIsWap()
  {
    return this.isWap;
  }

  public final byte getNetType()
  {
    return this.netType;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(76067);
    try
    {
      Exception localException1 = new java/lang/Exception;
      localException1.<init>("Need define key first!");
      AppMethodBeat.o(76067);
      throw localException1;
    }
    catch (Exception localException2)
    {
      ab.printErrStackTrace("Net", localException2, "", new Object[0]);
      AppMethodBeat.o(76067);
    }
    return 0;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(76070);
    this.netType = paramJceInputStream.read(this.netType, 0, true);
    this.extNetworkOperator = paramJceInputStream.readString(1, false);
    this.extNetworkType = paramJceInputStream.read(this.extNetworkType, 2, false);
    this.isWap = paramJceInputStream.read(this.isWap, 3, false);
    AppMethodBeat.o(76070);
  }

  public final void setExtNetworkOperator(String paramString)
  {
    this.extNetworkOperator = paramString;
  }

  public final void setExtNetworkType(int paramInt)
  {
    this.extNetworkType = paramInt;
  }

  public final void setIsWap(byte paramByte)
  {
    this.isWap = ((byte)paramByte);
  }

  public final void setNetType(byte paramByte)
  {
    this.netType = ((byte)paramByte);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(76069);
    paramJceOutputStream.write(this.netType, 0);
    if (this.extNetworkOperator != null)
      paramJceOutputStream.write(this.extNetworkOperator, 1);
    paramJceOutputStream.write(this.extNetworkType, 2);
    paramJceOutputStream.write(this.isWap, 3);
    AppMethodBeat.o(76069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.protocol.jce.Net
 * JD-Core Version:    0.6.2
 */