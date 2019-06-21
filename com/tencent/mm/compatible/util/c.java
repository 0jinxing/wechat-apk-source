package com.tencent.mm.compatible.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@TargetApi(8)
public final class c
  implements b.b
{
  private Context context;
  private AudioManager euK;
  b.a euL;
  private AudioManager.OnAudioFocusChangeListener euM;

  public c(Context paramContext)
  {
    AppMethodBeat.i(93065);
    this.euM = new c.1(this);
    this.context = paramContext;
    AppMethodBeat.o(93065);
  }

  public final boolean Mm()
  {
    AppMethodBeat.i(93067);
    if ((this.euK == null) && (this.context != null))
      this.euK = ((AudioManager)this.context.getSystemService("audio"));
    boolean bool;
    if (this.euK != null)
      if (1 == this.euK.abandonAudioFocus(this.euM))
        bool = true;
    while (true)
    {
      ab.c("MicroMsg.AudioFocusHelper", "jacks abandonFocus: %B, %x", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.euM.hashCode()) });
      AppMethodBeat.o(93067);
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }

  public final void a(b.a parama)
  {
    this.euL = parama;
  }

  public final boolean requestFocus()
  {
    AppMethodBeat.i(93066);
    if ((this.euK == null) && (this.context != null))
      this.euK = ((AudioManager)this.context.getSystemService("audio"));
    boolean bool;
    if (this.euK != null)
      if (1 == this.euK.requestAudioFocus(this.euM, 3, 2))
        bool = true;
    while (true)
    {
      ab.c("MicroMsg.AudioFocusHelper", "jacks requestFocus: %B, %x", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.euM.hashCode()) });
      AppMethodBeat.o(93066);
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.c
 * JD-Core Version:    0.6.2
 */