package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.i.k;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.s;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public final class a
  implements com.google.android.exoplayer2.metadata.a
{
  private s aYf;
  private final l bdm;
  private final k bfE;

  public a()
  {
    AppMethodBeat.i(95363);
    this.bdm = new l();
    this.bfE = new k();
    AppMethodBeat.o(95363);
  }

  public final Metadata a(d paramd)
  {
    AppMethodBeat.i(95364);
    if ((this.aYf == null) || (paramd.aOr != this.aYf.tQ()))
    {
      this.aYf = new s(paramd.aSk);
      this.aYf.ap(paramd.aSk - paramd.aOr);
    }
    ByteBuffer localByteBuffer = paramd.aEY;
    paramd = localByteBuffer.array();
    int i = localByteBuffer.limit();
    this.bdm.n(paramd, i);
    this.bfE.n(paramd, i);
    this.bfE.ee(39);
    long l = this.bfE.ed(1);
    l = this.bfE.ed(32) | l << 32;
    this.bfE.ee(20);
    i = this.bfE.ed(12);
    int j = this.bfE.ed(8);
    this.bdm.eM(14);
    switch (j)
    {
    default:
      paramd = null;
      if (paramd == null)
      {
        paramd = new Metadata(new Metadata.Entry[0]);
        AppMethodBeat.o(95364);
      }
      break;
    case 0:
    case 4:
    case 5:
    case 6:
    case 255:
    }
    while (true)
    {
      return paramd;
      paramd = new SpliceNullCommand();
      break;
      paramd = SpliceScheduleCommand.y(this.bdm);
      break;
      paramd = SpliceInsertCommand.a(this.bdm, l, this.aYf);
      break;
      paramd = TimeSignalCommand.b(this.bdm, l, this.aYf);
      break;
      paramd = PrivateCommand.a(this.bdm, i, l);
      break;
      paramd = new Metadata(new Metadata.Entry[] { paramd });
      AppMethodBeat.o(95364);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.a
 * JD-Core Version:    0.6.2
 */