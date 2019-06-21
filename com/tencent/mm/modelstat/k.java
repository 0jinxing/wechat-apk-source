package com.tencent.mm.modelstat;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k
{
  private static final String FORMAT;
  int bJt = -2;
  public int fSZ = 0;
  public int fTA = 0;
  public int fTB = 0;
  public int fTa = 0;
  public int fTb = 0;
  public int fTc = 0;
  public int fTd = 0;
  public int fTe = 0;
  public int fTf = 0;
  public int fTg = 0;
  public int fTh = 0;
  public int fTi = 0;
  public int fTj = 0;
  public int fTk = 0;
  public int fTl = 0;
  public int fTm = 0;
  public int fTn = 0;
  public int fTo = 0;
  public int fTp = 0;
  public int fTq = 0;
  public int fTr = 0;
  public int fTs = 0;
  public int fTt = 0;
  public int fTu = 0;
  public int fTv = 0;
  public int fTw = 0;
  public int fTx = 0;
  public int fTy = 0;
  public int fTz = 0;
  public int id = 0;

  static
  {
    AppMethodBeat.i(78742);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NetStatInfo:");
    localStringBuilder.append("[mobile in=%dB/%dB/%dB, out=%dB/%dB/%dB]");
    localStringBuilder.append("[wifi in=%dB/%dB/%dB, out=%dB/%dB/%dB]");
    localStringBuilder.append("[text in=%d/%dB, out=%d/%dB]");
    localStringBuilder.append("[image in=%d/%dB, out=%d/%dB]");
    localStringBuilder.append("[voice in=%d/%dB, out=%d/%dB]");
    localStringBuilder.append("[video in=%d/%dB, out=%d/%dB]");
    FORMAT = localStringBuilder.toString();
    AppMethodBeat.o(78742);
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(78740);
    this.id = paramCursor.getInt(0);
    this.fSZ = paramCursor.getInt(1);
    this.fTa = paramCursor.getInt(2);
    this.fTb = paramCursor.getInt(3);
    this.fTc = paramCursor.getInt(4);
    this.fTd = paramCursor.getInt(5);
    this.fTe = paramCursor.getInt(6);
    this.fTf = paramCursor.getInt(7);
    this.fTg = paramCursor.getInt(8);
    this.fTh = paramCursor.getInt(9);
    this.fTi = paramCursor.getInt(10);
    this.fTj = paramCursor.getInt(11);
    this.fTk = paramCursor.getInt(12);
    this.fTl = paramCursor.getInt(13);
    this.fTm = paramCursor.getInt(14);
    this.fTn = paramCursor.getInt(15);
    this.fTo = paramCursor.getInt(16);
    this.fTp = paramCursor.getInt(17);
    this.fTq = paramCursor.getInt(18);
    this.fTr = paramCursor.getInt(19);
    this.fTs = paramCursor.getInt(20);
    this.fTt = paramCursor.getInt(21);
    this.fTu = paramCursor.getInt(22);
    this.fTv = paramCursor.getInt(23);
    this.fTw = paramCursor.getInt(24);
    this.fTx = paramCursor.getInt(25);
    this.fTy = paramCursor.getInt(26);
    this.fTz = paramCursor.getInt(27);
    this.fTA = paramCursor.getInt(28);
    this.fTB = paramCursor.getInt(29);
    AppMethodBeat.o(78740);
  }

  public final String toString()
  {
    AppMethodBeat.i(78741);
    String str = String.format(FORMAT, new Object[] { Integer.valueOf(this.fTi), Integer.valueOf(this.fTy), Integer.valueOf(this.fTk), Integer.valueOf(this.fTu), Integer.valueOf(this.fTA), Integer.valueOf(this.fTw), Integer.valueOf(this.fTj), Integer.valueOf(this.fTz), Integer.valueOf(this.fTl), Integer.valueOf(this.fTv), Integer.valueOf(this.fTB), Integer.valueOf(this.fTx), Integer.valueOf(this.fTa), Integer.valueOf(this.fTb), Integer.valueOf(this.fTm), Integer.valueOf(this.fTn), Integer.valueOf(this.fTc), Integer.valueOf(this.fTd), Integer.valueOf(this.fTo), Integer.valueOf(this.fTp), Integer.valueOf(this.fTe), Integer.valueOf(this.fTf), Integer.valueOf(this.fTq), Integer.valueOf(this.fTr), Integer.valueOf(this.fTg), Integer.valueOf(this.fTh), Integer.valueOf(this.fTs), Integer.valueOf(this.fTt) });
    AppMethodBeat.o(78741);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.k
 * JD-Core Version:    0.6.2
 */