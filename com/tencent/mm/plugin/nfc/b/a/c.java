package com.tencent.mm.plugin.nfc.b.a;

import android.nfc.Tag;
import android.nfc.tech.NfcA;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.nfc.a.a;
import com.tencent.mm.plugin.nfc.a.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
  implements d
{
  private NfcA oTs;

  public c(Tag paramTag)
  {
    AppMethodBeat.i(23044);
    this.oTs = NfcA.get(paramTag);
    AppMethodBeat.o(23044);
  }

  public final com.tencent.mm.plugin.nfc.a.c a(a parama)
  {
    AppMethodBeat.i(23045);
    if (this.oTs == null)
    {
      ab.e("MicroMsg.ApduEngineNfcA", "[NFC]NfcA is null");
      parama = new IllegalStateException("NfcA is null");
      AppMethodBeat.o(23045);
      throw parama;
    }
    connect();
    Object localObject = null;
    a locala = parama;
    com.tencent.mm.plugin.nfc.a.c localc = new com.tencent.mm.plugin.nfc.a.c(this.oTs.transceive(locala.getBytes()));
    parama = localObject;
    if (localc.oTb.length != 0)
    {
      if (localc.oTb.length - 2 >= 0)
        break label100;
      parama = localc;
    }
    while (true)
    {
      label92: AppMethodBeat.o(23045);
      return parama;
      label100: if (localc.bVw() == 108)
      {
        locala.Ag(localc.bVx());
        break;
      }
      if (localObject == null)
        localObject = localc;
      while (true)
      {
        parama = localObject;
        if (localc.bVw() != 97)
          break label92;
        if (localc.bVx() == 0)
          break label178;
        locala = new a((byte[])b.oTj.clone());
        break;
        localObject.a(localc);
      }
      label178: localObject.oTb[(localObject.oTb.length - 1)] = ((byte)-112);
      parama = localObject;
    }
  }

  public final boolean bVA()
  {
    AppMethodBeat.i(23049);
    close();
    connect();
    AppMethodBeat.o(23049);
    return true;
  }

  public final void close()
  {
    AppMethodBeat.i(23047);
    if (this.oTs.isConnected())
      this.oTs.close();
    AppMethodBeat.o(23047);
  }

  public final boolean connect()
  {
    AppMethodBeat.i(23046);
    if (!this.oTs.isConnected())
      this.oTs.connect();
    AppMethodBeat.o(23046);
    return true;
  }

  public final boolean isConnected()
  {
    AppMethodBeat.i(23048);
    boolean bool = this.oTs.isConnected();
    AppMethodBeat.o(23048);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc.b.a.c
 * JD-Core Version:    0.6.2
 */