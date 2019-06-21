package com.tencent.mm.plugin.nfc_open.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.j;
import com.tencent.mm.g.a.j.a;
import com.tencent.mm.plugin.nfc.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends com.tencent.mm.sdk.b.c<j>
{
  public a()
  {
    AppMethodBeat.i(23057);
    this.xxI = j.class.getName().hashCode();
    AppMethodBeat.o(23057);
  }

  private static boolean a(j paramj)
  {
    AppMethodBeat.i(23058);
    if (!(paramj instanceof j))
      AppMethodBeat.o(23058);
    while (true)
    {
      return false;
      if (paramj.csb != null)
        break;
      AppMethodBeat.o(23058);
    }
    int i = paramj.csb.actionCode;
    Object localObject1 = paramj.csb.context;
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = ah.getContext();
    localObject1 = new Bundle();
    switch (i)
    {
    case 4006:
    case 4007:
    default:
    case 4005:
    case 4008:
    case 4001:
    case 4002:
    case 4003:
    case 4004:
    }
    while (true)
    {
      paramj.csc.csg = ((Bundle)localObject1);
      AppMethodBeat.o(23058);
      break;
      ((Bundle)localObject1).putString("id", com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(com.tencent.mm.plugin.nfc.b.a.a.bVz().oTn));
      continue;
      ((Bundle)localObject1).putString("info", com.tencent.mm.plugin.nfc.b.a.a.bVz().getInfo());
      continue;
      ((Bundle)localObject1).putInt("status", com.tencent.mm.plugin.nfc.b.a.a.bVz().eF((Context)localObject2));
      continue;
      i = com.tencent.mm.plugin.nfc.b.a.a.bVz().eG((Context)localObject2);
      ab.i("MicroMsg.ApduEngineFuncListener", "alvinluo NFC connect status: %d", new Object[] { Integer.valueOf(i) });
      ((Bundle)localObject1).putInt("status", i);
      continue;
      localObject2 = paramj.csb.csd;
      if (bo.isNullOrNil((String)localObject2))
      {
        ab.e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
      }
      else
      {
        try
        {
          localObject4 = new com/tencent/mm/plugin/nfc/a/a;
          ((com.tencent.mm.plugin.nfc.a.a)localObject4).<init>((String)localObject2);
          ((Bundle)localObject1).putString("result", com.tencent.mm.plugin.nfc.b.a.a.bVz().a((com.tencent.mm.plugin.nfc.a.a)localObject4).toString());
        }
        catch (Exception localException1)
        {
          ab.e("MicroMsg.ApduEngineFuncListener", "alex: execute nfc command exception");
          ab.printErrStackTrace("MicroMsg.ApduEngineFuncListener", localException1, "", new Object[0]);
          ((Bundle)localObject1).putString("result", null);
        }
        continue;
        boolean bool1;
        boolean bool2;
        try
        {
          String str = paramj.csb.csd;
          bool1 = paramj.csb.cse;
          bool2 = paramj.csb.csf;
          if (!bo.isNullOrNil(str))
            break label381;
          ab.e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
        }
        catch (Exception localException2)
        {
          ab.e("MicroMsg.ApduEngineFuncListener", "alex: execute nfc command exception");
          ab.printErrStackTrace("MicroMsg.ApduEngineFuncListener", localException2, "", new Object[0]);
          ((Bundle)localObject1).putString("result", null);
        }
        continue;
        label381: Object localObject4 = localException2.split("\\|");
        Object localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        int j = localObject4.length;
        i = 0;
        Object localObject5;
        if (i < j)
        {
          localObject5 = localObject4[i];
          if (bo.isNullOrNil((String)localObject5))
            ab.w("MicroMsg.ApduEngineFuncListener", "[NFC] batch transceive apduStr is null");
          while (true)
          {
            i++;
            break;
            String[] arrayOfString = ((String)localObject5).split(":");
            if ((arrayOfString == null) || (arrayOfString.length < 2))
            {
              ab.w("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu's size is wrong");
            }
            else
            {
              int k = bo.getInt(arrayOfString[0], 0);
              com.tencent.mm.plugin.nfc.b.a locala = new com/tencent/mm/plugin/nfc/b/a;
              localObject5 = new com/tencent/mm/plugin/nfc/a/a;
              ((com.tencent.mm.plugin.nfc.a.a)localObject5).<init>(arrayOfString[1]);
              locala.<init>(k, String.valueOf(k), (com.tencent.mm.plugin.nfc.a.a)localObject5);
              ((List)localObject3).add(locala);
            }
          }
        }
        com.tencent.mm.plugin.nfc.b.a.a.bVz().a((List)localObject3, bool1, bool2);
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject3 = ((List)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject5 = (com.tencent.mm.plugin.nfc.b.a)((Iterator)localObject3).next();
          if (((com.tencent.mm.plugin.nfc.b.a)localObject5).oTl == null)
            break;
          ((StringBuilder)localObject4).append(((com.tencent.mm.plugin.nfc.b.a)localObject5).id);
          ((StringBuilder)localObject4).append(":");
          ((StringBuilder)localObject4).append(((com.tencent.mm.plugin.nfc.b.a)localObject5).oTl.toString());
          ((StringBuilder)localObject4).append("|");
        }
        ((Bundle)localObject1).putString("result", ((StringBuilder)localObject4).toString());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc_open.a.a
 * JD-Core Version:    0.6.2
 */