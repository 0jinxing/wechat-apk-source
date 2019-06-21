package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.cd.h;
import com.tencent.mm.protocal.protobuf.axc;
import com.tencent.mm.protocal.protobuf.cbd;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class q extends j<p>
{
  public static final String[] fnj;
  public h fni;

  static
  {
    AppMethodBeat.i(37975);
    fnj = new String[] { j.a(p.ccO, "SnsReportKv") };
    AppMethodBeat.o(37975);
  }

  public q(h paramh)
  {
    super(paramh, p.ccO, "SnsReportKv", p.diI);
    this.fni = paramh;
  }

  private int a(cbd paramcbd, int paramInt)
  {
    AppMethodBeat.i(37973);
    try
    {
      byte[] arrayOfByte = paramcbd.toByteArray();
      paramcbd = new com/tencent/mm/plugin/sns/storage/p;
      paramcbd.<init>();
      paramcbd.field_value = arrayOfByte;
      paramcbd.field_logtime = System.currentTimeMillis();
      paramcbd.field_logsize = paramInt;
      paramcbd.field_offset = 0;
      paramcbd = paramcbd.Hl();
      paramInt = (int)this.fni.insert("SnsReportKv", "", paramcbd);
      ab.d("MicroMsg.SnsKvReportStg", "SnsKvReport Insert result ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(37973);
      return paramInt;
    }
    catch (Exception paramcbd)
    {
      while (true)
      {
        AppMethodBeat.o(37973);
        paramInt = 0;
      }
    }
  }

  public final int a(cbd paramcbd)
  {
    AppMethodBeat.i(37972);
    cbd localcbd = new cbd();
    int i = 0;
    int j = 0;
    int k = 0;
    if (i < paramcbd.vDW.size())
    {
      axc localaxc = (axc)paramcbd.vDW.get(i);
      if (localaxc.wBe.wR.length + k > 51200)
      {
        a(localcbd, k);
        j++;
        localcbd.vDW.clear();
        k = 0;
      }
      while (true)
      {
        i++;
        break;
        k += localaxc.wBe.wR.length;
        localcbd.vDW.add(localaxc);
      }
    }
    i = j;
    if (localcbd.vDW.size() > 0)
    {
      i = j + 1;
      a(localcbd, k);
    }
    AppMethodBeat.o(37972);
    return i;
  }

  public final cbd fr(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37974);
    Object localObject1 = "select rowid, *  from SnsReportKv";
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramInt2 > 0)
      localObject1 = "select rowid, *  from SnsReportKv" + " where rowid <= " + paramInt2;
    Cursor localCursor = this.fni.a((String)localObject1, null, 0);
    cbd localcbd = new cbd();
    ArrayList localArrayList = new ArrayList();
    localStringBuffer.append("target size " + paramInt1 + " current maxcolid " + paramInt2);
    if (localCursor.moveToFirst())
      paramInt2 = 0;
    while (true)
    {
      p localp = new p();
      localp.d(localCursor);
      int i = localp.field_offset;
      localStringBuffer.append("|offset: ".concat(String.valueOf(i)));
      localObject1 = new cbd();
      try
      {
        ((cbd)localObject1).parseFrom(localp.field_value);
        try
        {
          if (i >= ((cbd)localObject1).vDW.size())
            break label612;
          Object localObject2 = (axc)((cbd)localObject1).vDW.get(i);
          if (((axc)localObject2).wBe.wR.length + paramInt2 > paramInt1)
          {
            if (paramInt2 == 0)
            {
              localArrayList.add(Integer.valueOf(localp.reX));
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("error by server for the mini size ");
              ab.i("MicroMsg.SnsKvReportStg", paramInt1 + " vlauesize " + ((axc)localObject2).wBe.wR.length);
            }
            i = 1;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("|read end on ");
            localStringBuffer.append(localp.reX + " and get size " + paramInt2);
            if ((i == 0) || (localp.field_offset > ((cbd)localObject1).vDW.size()))
              break label501;
            a(localp.reX, localp);
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("|update new offset ");
            localStringBuffer.append(localp.field_offset);
          }
          while (true)
          {
            if (i == 0)
              break label597;
            label389: ab.i("MicroMsg.SnsKvReportStg", "read info " + localStringBuffer.toString());
            localCursor.close();
            localObject1 = localArrayList.iterator();
            while (((Iterator)localObject1).hasNext())
              delete(((Integer)((Iterator)localObject1).next()).intValue());
            localp.field_offset = (i + 1);
            localcbd.vDW.add(localObject2);
            int j = paramInt2 + ((axc)localObject2).wBe.wR.length;
            i++;
            paramInt2 = j;
            break;
            label501: localStringBuffer.append("|read full ");
            localArrayList.add(Integer.valueOf(localp.reX));
          }
        }
        catch (Exception localException1)
        {
          ab.printErrStackTrace("MicroMsg.SnsKvReportStg", localException1, "", new Object[0]);
          localArrayList.add(Integer.valueOf(localp.reX));
          ab.i("MicroMsg.SnsKvReportStg", "error paser then delete " + localp.reX);
        }
        label597: 
        while (!localCursor.moveToNext())
          break label389;
        AppMethodBeat.o(37974);
        return localcbd;
      }
      catch (Exception localException2)
      {
        while (true)
        {
          continue;
          label612: i = 0;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.q
 * JD-Core Version:    0.6.2
 */