package com.tencent.mm.plugin.nfc.b.a;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends com.tencent.mm.plugin.nfc.b.b
{
  private static a oTo = null;
  private Set<String> oTp;
  public d oTq = null;

  private boolean a(com.tencent.mm.plugin.nfc.b.a parama)
  {
    AppMethodBeat.i(23032);
    if (this.oTq == null)
    {
      ab.e("MicroMsg.ApduEngine", "[NFC]ApduEngine not ready !");
      parama = new IllegalStateException("ApduEngine not ready !");
      AppMethodBeat.o(23032);
      throw parama;
    }
    if ((parama == null) || (parama.oTk == null))
    {
      ab.e("MicroMsg.ApduEngine", "[NFC]apdu is null !");
      parama = new IllegalArgumentException("apdu is null !");
      AppMethodBeat.o(23032);
      throw parama;
    }
    ab.i("MicroMsg.ApduEngine", "[NFC][" + parama.name + "] do cmd : " + parama.oTk.toString());
    parama.oTl = b(parama.oTk);
    boolean bool;
    if (parama.oTl.bVy())
    {
      ab.i("MicroMsg.ApduEngine", "[NFC][" + parama.name + "] result==> OK : " + parama.oTl.toString());
      bool = true;
      AppMethodBeat.o(23032);
    }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.ApduEngine", "[NFC][" + parama.name + "] result==> fail : " + parama.oTl.toString());
      bool = false;
      AppMethodBeat.o(23032);
    }
  }

  private com.tencent.mm.plugin.nfc.a.c b(com.tencent.mm.plugin.nfc.a.a parama)
  {
    AppMethodBeat.i(23033);
    parama = this.oTq.a(parama);
    AppMethodBeat.o(23033);
    return parama;
  }

  public static a bVz()
  {
    AppMethodBeat.i(23029);
    if (oTo == null)
      oTo = new a();
    a locala = oTo;
    AppMethodBeat.o(23029);
    return locala;
  }

  public final com.tencent.mm.plugin.nfc.a.c a(com.tencent.mm.plugin.nfc.a.a parama)
  {
    AppMethodBeat.i(23031);
    parama = new com.tencent.mm.plugin.nfc.b.a(1, "def", parama);
    a(parama);
    parama = parama.oTl;
    AppMethodBeat.o(23031);
    return parama;
  }

  public final boolean a(Tag paramTag)
  {
    boolean bool = true;
    AppMethodBeat.i(23030);
    super.a(paramTag);
    this.oTp = new HashSet();
    for (String str : paramTag.getTechList())
    {
      ab.d("MicroMsg.ApduEngine", "[NFC]tech : ".concat(String.valueOf(str)));
      this.oTp.add(str);
    }
    try
    {
      if ((this.oTq != null) && (this.oTq.isConnected()))
        this.oTq.close();
      if (this.oTp.contains(IsoDep.class.getName()))
      {
        this.oTq = new b(paramTag);
        AppMethodBeat.o(23030);
        return bool;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ApduEngine", localIOException, "", new Object[0]);
        ab.e("MicroMsg.ApduEngine", localIOException.toString());
        continue;
        if (this.oTp.contains(NfcA.class.getName()))
        {
          this.oTq = new c(paramTag);
          AppMethodBeat.o(23030);
        }
        else
        {
          ab.i("MicroMsg.ApduEngine", "[NFC]ApduEngine not support this tag");
          AppMethodBeat.o(23030);
          bool = false;
        }
      }
    }
  }

  public final boolean a(List<com.tencent.mm.plugin.nfc.b.a> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(23034);
    paramList = paramList.iterator();
    boolean bool;
    if (paramList.hasNext())
    {
      bool = a((com.tencent.mm.plugin.nfc.b.a)paramList.next());
      if ((!bool) && (paramBoolean1))
      {
        AppMethodBeat.o(23034);
        paramBoolean1 = false;
      }
    }
    while (true)
    {
      return paramBoolean1;
      if ((!bool) || (!paramBoolean2))
        break;
      AppMethodBeat.o(23034);
      paramBoolean1 = false;
      continue;
      paramBoolean1 = true;
      AppMethodBeat.o(23034);
    }
  }

  public final int eF(Context paramContext)
  {
    int i = 2;
    AppMethodBeat.i(23035);
    paramContext = NfcAdapter.getDefaultAdapter(paramContext);
    if (paramContext == null)
    {
      ab.i("MicroMsg.ApduEngine", "[NFC] No nfc chip !");
      i = 0;
      AppMethodBeat.o(23035);
    }
    while (true)
    {
      return i;
      if (!paramContext.isEnabled())
      {
        i = 1;
        AppMethodBeat.o(23035);
      }
      else if (this.oTq == null)
      {
        i = 4;
        AppMethodBeat.o(23035);
      }
      else
      {
        try
        {
          if (this.oTq != null)
          {
            boolean bool = this.oTq.isConnected();
            if (bool)
            {
              i = 3;
              AppMethodBeat.o(23035);
            }
          }
          else
          {
            AppMethodBeat.o(23035);
          }
        }
        catch (IOException paramContext)
        {
          ab.e("MicroMsg.ApduEngine", "[NFC] IOException : " + paramContext.toString());
          AppMethodBeat.o(23035);
        }
      }
    }
  }

  public final int eG(Context paramContext)
  {
    AppMethodBeat.i(23036);
    int i = eF(paramContext);
    if ((i != 3) && (i != 2))
      AppMethodBeat.o(23036);
    while (true)
    {
      return i;
      try
      {
        if (this.oTq != null)
        {
          this.oTq.connect();
          boolean bool = this.oTq.isConnected();
          if (bool)
          {
            AppMethodBeat.o(23036);
            i = 3;
          }
        }
        else
        {
          AppMethodBeat.o(23036);
          i = 2;
        }
      }
      catch (IOException paramContext)
      {
        ab.e("MicroMsg.ApduEngine", "[NFC] IOException : " + paramContext.toString());
        AppMethodBeat.o(23036);
        i = 2;
      }
    }
  }

  public final String getInfo()
  {
    AppMethodBeat.i(23037);
    String str;
    if (this.oTm == null)
    {
      ab.w("MicroMsg.ApduEngine", "lo-nfc-getInfo: tag null");
      AppMethodBeat.o(23037);
      str = null;
    }
    while (true)
    {
      return str;
      long l = bo.anU();
      JSONObject localJSONObject = new JSONObject();
      ab.d("MicroMsg.ApduEngine", "lo-nfc-getInfo: mTechList = " + this.oTp.size());
      Iterator localIterator = this.oTp.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          ab.d("MicroMsg.ApduEngine", "lo-nfc-getInfo: tech = ".concat(String.valueOf(str)));
          Object localObject2;
          while (true)
          {
            try
            {
              if (!str.equals(NfcA.class.getName()))
                break label258;
              localObject2 = NfcA.get(this.oTm);
              if (localObject2 != null)
                break label212;
              ab.w("MicroMsg.ApduEngineNfcA", "lo-nfc-getInfoJsonObject: get nfcA null");
              str = null;
              localJSONObject.put(NfcA.class.getSimpleName(), str);
            }
            catch (JSONException localJSONException)
            {
              ab.w("MicroMsg.ApduEngine", "lo-nfc-getInfo: exp:+" + localJSONException.getLocalizedMessage());
              localObject1 = localJSONObject.toString();
              AppMethodBeat.o(23037);
            }
            break;
            label212: localObject1 = new org/json/JSONObject;
            ((JSONObject)localObject1).<init>();
            ((JSONObject)localObject1).put("atqa", com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(((NfcA)localObject2).getAtqa()));
            ((JSONObject)localObject1).put("sak", com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(com.tencent.mm.plugin.nfc.c.a.b(((NfcA)localObject2).getSak())));
          }
          label258: if (((String)localObject1).equals(IsoDep.class.getName()))
          {
            localObject2 = IsoDep.get(this.oTm);
            if (localObject2 == null)
            {
              ab.w("MicroMsg.ApduEngineIsoDep", "lo-nfc-getInfoJsonObject: get IsoDep null");
              localObject1 = null;
            }
            while (true)
            {
              localJSONObject.put(IsoDep.class.getSimpleName(), localObject1);
              break;
              localObject1 = new org/json/JSONObject;
              ((JSONObject)localObject1).<init>();
              ((JSONObject)localObject1).put("hiLayerResponse", com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(((IsoDep)localObject2).getHiLayerResponse()));
              ((JSONObject)localObject1).put("historicalBytes", com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(((IsoDep)localObject2).getHistoricalBytes()));
            }
          }
        }
      ab.v("MicroMsg.ApduEngine", "lo-nfc-getInfo: cost=" + (bo.anU() - l));
      ab.v("MicroMsg.ApduEngine", "lo-nfc-getInfo: res=" + localJSONObject.toString());
      Object localObject1 = localJSONObject.toString();
      AppMethodBeat.o(23037);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc.b.a.a
 * JD-Core Version:    0.6.2
 */