package com.tencent.mm.plugin.backup.g;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.bt.a;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.plugin.backup.f.j;
import com.tencent.mm.plugin.backup.i.x;
import com.tencent.mm.plugin.backup.i.y;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.protocal.protobuf.gv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class c extends b
{
  private static String TAG = "MicroMsg.BackupDataPushScene";
  private f fur;
  private PByteArray jxc;
  public x jxp;
  private y jxq;
  private int jxr;
  private c.a jxs;

  private c(c.b paramb, String paramString, c.a parama, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17649);
    this.jxp = new x();
    this.jxq = new y();
    this.jxr = 0;
    this.jxc = new PByteArray();
    this.jxs = null;
    this.jxp.jCx = paramString;
    this.jxp.jCy = 2;
    this.fur = new c.1(this, paramb);
    this.jxs = parama;
    c.a.b(parama, this);
    paramString = this.jxs;
    if (paramString.frO <= 0)
    {
      paramb = new Pair(Integer.valueOf(0), new byte[0]);
      if ((paramb.second == null) || (paramb.first == null))
      {
        ab.w(TAG, "BackupDataPushScene media backFileOp getNext error, file path:%s", new Object[] { this.jxs.filePath });
        this.jxp.jBi = null;
        AppMethodBeat.o(17649);
      }
    }
    else
    {
      if (paramString.frO - paramString.offset > 524288L);
      int i;
      for (long l = 524288L; ; l = paramString.frO - paramString.offset)
      {
        i = (int)l;
        paramb = new byte[i];
        if (paramString.jxw == null)
          break label273;
        System.arraycopy(paramString.jxw, paramString.offset, paramb, 0, i);
        int j = paramString.offset;
        paramString.offset += i;
        paramb = new Pair(Integer.valueOf(j), paramb);
        break;
      }
      label273: if (i < 524288L);
      for (bool = true; ; bool = false)
      {
        paramString.b(paramb, bool);
        break;
      }
    }
    paramString = (byte[])paramb.second;
    this.jxp.jCz = this.jxs.frO;
    this.jxp.jCA = ((Integer)paramb.first).intValue();
    this.jxp.jCB = (this.jxp.jCA + paramString.length);
    paramb = this.jxp;
    if (this.jxp.jCB == this.jxp.jCz);
    for (boolean bool = true; ; bool = false)
    {
      paramb.jBi = a(paramString, bool, paramArrayOfByte);
      aUi();
      AppMethodBeat.o(17649);
      break;
    }
  }

  private c(c.b paramb, String paramString, LinkedList<gu> paramLinkedList, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17650);
    this.jxp = new x();
    this.jxq = new y();
    this.jxr = 0;
    this.jxc = new PByteArray();
    this.jxs = null;
    this.jxp.jCx = paramString;
    this.jxp.jCy = 1;
    this.fur = new c.2(this, paramb);
    try
    {
      paramb = new com/tencent/mm/protocal/protobuf/gv;
      paramb.<init>();
      paramb.jBw = paramLinkedList;
      paramb.jBv = paramLinkedList.size();
      paramb = paramb.toByteArray();
      paramString = paramb;
      if (paramb == null)
        paramString = new byte[0];
      this.jxp.jCA = 0;
      this.jxp.jCB = paramString.length;
      this.jxp.jCz = paramString.length;
      this.jxp.jBi = a(paramString, true, paramArrayOfByte);
      aUi();
      AppMethodBeat.o(17650);
      return;
    }
    catch (Exception paramString)
    {
      paramb = TAG;
      if (paramLinkedList != null);
    }
    for (int i = -1; ; i = paramLinkedList.size())
    {
      ab.e(paramb, "BackupDataPushScene text, BakChatMsgList to buf error, list size[%d], errMsg:%s", new Object[] { Integer.valueOf(i), paramString.getMessage() });
      paramb = null;
      break;
    }
  }

  private static com.tencent.mm.bt.b a(byte[] paramArrayOfByte1, boolean paramBoolean, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(17654);
    if ((bo.cc(paramArrayOfByte2) > 0) && (bo.cc(paramArrayOfByte1) > 0))
    {
      paramArrayOfByte1 = new com.tencent.mm.bt.b(AesEcb.aesCryptEcb(paramArrayOfByte1, paramArrayOfByte2, true, paramBoolean));
      AppMethodBeat.o(17654);
    }
    while (true)
    {
      return paramArrayOfByte1;
      paramArrayOfByte1 = new com.tencent.mm.bt.b(paramArrayOfByte1);
      AppMethodBeat.o(17654);
    }
  }

  public static void a(c.b paramb, c paramc, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17647);
    paramString2 = new c.a(paramString2);
    int i;
    if (paramString2.frO <= 0)
      i = 1;
    while (true)
    {
      for (int j = 0; j < i; j++)
        paramc.a(new c(paramb, paramString1, paramString2, paramArrayOfByte));
      j = (int)(paramString2.frO / 524288L);
      i = j;
      if (paramString2.frO % 524288L != 0L)
        i = j + 1;
    }
    AppMethodBeat.o(17647);
  }

  public static void a(c.b paramb, c paramc, String paramString, LinkedList<gu> paramLinkedList, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17648);
    paramc.a(new c(paramb, paramString, paramLinkedList, paramArrayOfByte));
    AppMethodBeat.o(17648);
  }

  private void aUi()
  {
    AppMethodBeat.i(17652);
    this.jxr = aUe();
    try
    {
      j.a(this.jxp.toByteArray(), this.jxr, (short)6, this.jxc, b.jqS);
      a(this.jxr, this.jxc);
      AppMethodBeat.o(17652);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(TAG, localException, "PacketBackupDataPush to buf fail:%s", new Object[] { localException.toString() });
        AppMethodBeat.o(17652);
      }
    }
  }

  public final a aTS()
  {
    return this.jxq;
  }

  public final a aTT()
  {
    return this.jxp;
  }

  public final boolean aUc()
  {
    AppMethodBeat.i(17653);
    byte[] arrayOfByte = this.jxc.value;
    int i = this.jxr;
    if (b.jxg != null)
      ab.i("MicroMsg.BackupBaseScene", "doSceneSameThread ret[%d], sendSeq[%d], type[%d], buflen[%d]", new Object[] { Integer.valueOf(b.jxg.j(i, arrayOfByte)), Integer.valueOf(i), Integer.valueOf(getType()), Integer.valueOf(arrayOfByte.length) });
    AppMethodBeat.o(17653);
    return true;
  }

  public final int aUj()
  {
    if (this.jxc.value == null);
    for (int i = 0; ; i = this.jxc.value.length)
      return i;
  }

  public final int getType()
  {
    return 6;
  }

  public final void rw(int paramInt)
  {
    AppMethodBeat.i(17651);
    this.fur.onSceneEnd(0, this.jxq.jBT, "", this);
    AppMethodBeat.o(17651);
  }

  public static abstract interface c
  {
    public abstract void a(c paramc);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.c
 * JD-Core Version:    0.6.2
 */