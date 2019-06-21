package com.tencent.mm.plugin.nfc.b.a;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.nfc.a.a;
import com.tencent.mm.plugin.nfc.a.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  implements d
{
  private IsoDep oTr;

  public b(Tag paramTag)
  {
    AppMethodBeat.i(23038);
    if (paramTag == null)
    {
      ab.e("MicroMsg.ApduEngineIsoDep", "[NFC]tag is null");
      paramTag = new IllegalStateException("tag is null");
      AppMethodBeat.o(23038);
      throw paramTag;
    }
    this.oTr = IsoDep.get(paramTag);
    AppMethodBeat.o(23038);
  }

  public final c a(a parama)
  {
    AppMethodBeat.i(23043);
    if (this.oTr == null)
    {
      ab.e("MicroMsg.ApduEngineIsoDep", "[NFC]IsoDep is null");
      parama = new IllegalStateException("IsoDep is null");
      AppMethodBeat.o(23043);
      throw parama;
    }
    connect();
    Object localObject = null;
    a locala = parama;
    parama = (a)localObject;
    c localc;
    while (true)
    {
      localc = new c(this.oTr.transceive(locala.getBytes()));
      localObject = parama;
      if (localc.oTb.length != 0)
      {
        if (localc.oTb.length - 2 <= 0)
          localObject = localc;
      }
      else
      {
        label94: AppMethodBeat.o(23043);
        return localObject;
      }
      if (localc.bVw() != 108)
        break;
      locala.Ag(localc.bVx());
    }
    if (parama == null)
      parama = localc;
    while (true)
    {
      localObject = parama;
      if (localc.bVw() != 97)
        break label94;
      locala = new a((byte[])com.tencent.mm.plugin.nfc.a.b.oTj.clone());
      break;
      parama.a(localc);
    }
  }

  public final boolean bVA()
  {
    AppMethodBeat.i(23042);
    close();
    connect();
    AppMethodBeat.o(23042);
    return true;
  }

  public final void close()
  {
    AppMethodBeat.i(23040);
    if (this.oTr.isConnected())
      this.oTr.close();
    AppMethodBeat.o(23040);
  }

  public final boolean connect()
  {
    AppMethodBeat.i(23039);
    if (!this.oTr.isConnected())
      this.oTr.connect();
    AppMethodBeat.o(23039);
    return true;
  }

  public final boolean isConnected()
  {
    AppMethodBeat.i(23041);
    boolean bool = this.oTr.isConnected();
    AppMethodBeat.o(23041);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc.b.a.b
 * JD-Core Version:    0.6.2
 */