package com.tencent.mm.cache;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ArtistCacheManager extends BroadcastReceiver
{
  private static ArtistCacheManager efi;
  public static HashMap<String, ArtistCacheManager.a> efj;
  private static HashSet<com.tencent.mm.e.a> efk;
  public String efl;

  static
  {
    AppMethodBeat.i(116214);
    efj = new HashMap();
    efk = new HashSet();
    AppMethodBeat.o(116214);
  }

  public static ArtistCacheManager Jc()
  {
    AppMethodBeat.i(116210);
    if (efi == null)
      efi = new ArtistCacheManager();
    ArtistCacheManager localArtistCacheManager = efi;
    AppMethodBeat.o(116210);
    return localArtistCacheManager;
  }

  public final void Jd()
  {
    AppMethodBeat.i(116213);
    ab.i("MicroMsg.ArtistCacheManager", "[clearAllCache]");
    Iterator localIterator = efj.entrySet().iterator();
    while (localIterator.hasNext())
      ((ArtistCacheManager.a)((Map.Entry)localIterator.next()).getValue()).clearAll();
    efk.clear();
    efi = null;
    com.tencent.mm.sdk.g.d.post(new ArtistCacheManager.2(this), "MicroMsg.ArtistCacheManager[clearAllCache]");
    AppMethodBeat.o(116213);
  }

  public final <T extends d> T a(com.tencent.mm.e.a parama)
  {
    Object localObject = null;
    AppMethodBeat.i(116211);
    if (efj.containsKey(this.efl))
    {
      ArtistCacheManager.a locala = (ArtistCacheManager.a)efj.get(this.efl);
      if (!locala.efo.containsKey(parama));
      switch (3.efn[parama.ordinal()])
      {
      default:
        if (localObject != null)
          ((d)localObject).onCreate();
        if ((localObject != null) && (!locala.efo.containsKey(parama)))
          locala.efo.put(parama, localObject);
        parama = (d)locala.efo.get(parama);
        AppMethodBeat.o(116211);
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      return parama;
      localObject = new b();
      break;
      localObject = new c();
      break;
      localObject = new g();
      break;
      localObject = new a();
      break;
      ab.e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", new Object[] { this.efl });
      AppMethodBeat.o(116211);
      parama = null;
    }
  }

  @Deprecated
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(116212);
    ab.i("MicroMsg.ArtistCacheManager", "[onReceive]");
    if ((paramIntent != null) && (paramIntent.getAction().equals("com.tencent.mm.plugin.photoedit.action.clear")))
      Jd();
    AppMethodBeat.o(116212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.ArtistCacheManager
 * JD-Core Version:    0.6.2
 */