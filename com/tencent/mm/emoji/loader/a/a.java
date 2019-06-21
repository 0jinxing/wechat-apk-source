package com.tencent.mm.emoji.loader.a;

import a.l;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/cache/AnimateCache;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "cache", "Lcom/tencent/mm/sdk/platformtools/LruCache;", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/drawable/Drawable;", "get", "key", "put", "", "drawable", "plugin-emojisdk_release"})
public final class a
{
  private static final String TAG = "MicroMsg.EmojiLoader.AnimateCache";
  private static final ae<String, WeakReference<Drawable>> exy;
  public static final a exz;

  static
  {
    AppMethodBeat.i(63167);
    exz = new a();
    TAG = "MicroMsg.EmojiLoader.AnimateCache";
    exy = new ae(20);
    AppMethodBeat.o(63167);
  }

  public static void b(String paramString, Drawable paramDrawable)
  {
    AppMethodBeat.i(63166);
    ab.i(TAG, "put ".concat(String.valueOf(paramString)));
    if (paramString != null)
      if (paramDrawable != null)
      {
        exy.put(paramString, new WeakReference(paramDrawable));
        AppMethodBeat.o(63166);
      }
    while (true)
    {
      return;
      exy.remove(paramString);
      AppMethodBeat.o(63166);
    }
  }

  public static Drawable kQ(String paramString)
  {
    AppMethodBeat.i(63165);
    ab.i(TAG, "get ".concat(String.valueOf(paramString)));
    if (paramString == null)
    {
      AppMethodBeat.o(63165);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = (WeakReference)exy.get(paramString);
      if (paramString != null)
      {
        paramString = (Drawable)paramString.get();
        AppMethodBeat.o(63165);
      }
      else
      {
        AppMethodBeat.o(63165);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.a.a
 * JD-Core Version:    0.6.2
 */