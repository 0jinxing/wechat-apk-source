package com.tencent.mm.plugin.d.a.b;

import android.bluetooth.BluetoothGattCharacteristic;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private int jFv = 20;
  private int jFw = 0;
  private int jFx = 0;
  BluetoothGattCharacteristic jFy = null;
  private byte[] mData = null;

  public final byte[] aVu()
  {
    AppMethodBeat.i(18362);
    int i = this.jFx - this.jFw;
    byte[] arrayOfByte;
    if (i == 0)
    {
      arrayOfByte = null;
      AppMethodBeat.o(18362);
      return arrayOfByte;
    }
    if (i < this.jFv);
    while (true)
    {
      arrayOfByte = new byte[i];
      System.arraycopy(this.mData, this.jFw, arrayOfByte, 0, i);
      this.jFw = (i + this.jFw);
      AppMethodBeat.o(18362);
      break;
      i = this.jFv;
    }
  }

  public final void setData(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(18361);
    if (paramArrayOfByte == null)
    {
      this.mData = null;
      this.jFx = 0;
      this.jFw = 0;
      AppMethodBeat.o(18361);
    }
    while (true)
    {
      return;
      this.mData = new byte[paramArrayOfByte.length];
      System.arraycopy(paramArrayOfByte, 0, this.mData, 0, paramArrayOfByte.length);
      this.jFx = paramArrayOfByte.length;
      this.jFw = 0;
      AppMethodBeat.o(18361);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.a
 * JD-Core Version:    0.6.2
 */