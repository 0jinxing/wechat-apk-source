package com.tencent.mm.plugin.gif;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.a.f.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.r;
import java.lang.ref.WeakReference;

public class c
{
  private static c not;
  f<String, WeakReference<e>> nou;
  f<String, WeakReference<b>> nov;

  public c()
  {
    AppMethodBeat.i(62352);
    this.nou = new com.tencent.mm.memory.a.c(10);
    this.nov = new com.tencent.mm.memory.a.c(new f.b()
    {
    });
    AppMethodBeat.o(62352);
  }

  public static c bFN()
  {
    try
    {
      AppMethodBeat.i(62353);
      if (not == null);
      try
      {
        if (not == null)
        {
          localc = new com/tencent/mm/plugin/gif/c;
          localc.<init>();
          not = localc;
        }
        c localc = not;
        AppMethodBeat.o(62353);
        return localc;
      }
      finally
      {
        AppMethodBeat.o(62353);
      }
    }
    finally
    {
    }
  }

  public final b Ox(String paramString)
  {
    AppMethodBeat.i(62354);
    b localb = null;
    if (this.nov.get(paramString) != null)
      localb = (b)((WeakReference)this.nov.get(paramString)).get();
    AppMethodBeat.o(62354);
    return localb;
  }

  public final b b(Resources paramResources, int paramInt)
  {
    AppMethodBeat.i(62356);
    if (this.nov.get(null) != null);
    for (b localb = (b)((WeakReference)this.nov.get(null)).get(); ; localb = null)
    {
      Object localObject = localb;
      if (localb == null)
      {
        localObject = new d(paramResources, paramInt);
        this.nov.put(null, new WeakReference(localObject));
      }
      AppMethodBeat.o(62356);
      return localObject;
    }
  }

  public final b eD(String paramString1, String paramString2)
  {
    AppMethodBeat.i(62355);
    b localb = null;
    if (this.nov.get(paramString1) != null)
      localb = (b)((WeakReference)this.nov.get(paramString1)).get();
    Object localObject = localb;
    long l;
    if (localb == null)
    {
      l = System.currentTimeMillis();
      if (!r.amp(paramString2))
        break label121;
    }
    label121: for (paramString2 = new h(paramString2); ; paramString2 = new d(paramString2))
    {
      ab.d("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "new MMAnimateDrawable use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      this.nov.put(paramString1, new WeakReference(paramString2));
      localObject = paramString2;
      AppMethodBeat.o(62355);
      return localObject;
    }
  }

  public final b x(String paramString, byte[] paramArrayOfByte)
  {
    b localb = null;
    Object localObject = null;
    AppMethodBeat.i(62357);
    if (paramArrayOfByte == null)
    {
      AppMethodBeat.o(62357);
      return localObject;
    }
    if (this.nov.get(paramString) != null)
      localb = (b)((WeakReference)this.nov.get(paramString)).get();
    localObject = localb;
    if (localb == null)
      if ((!r.bU(paramArrayOfByte)) || (!((PluginEmoji)g.M(PluginEmoji.class)).getEmojiMgr().bjX()))
        break label139;
    label139: for (localObject = new h(paramArrayOfByte); ; localObject = new d(paramArrayOfByte))
    {
      this.nov.put(paramString, new WeakReference(localObject));
      if (!((b)localObject).isRunning())
        ((b)localObject).reset();
      AppMethodBeat.o(62357);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.c
 * JD-Core Version:    0.6.2
 */