package com.tencent.mm.plugin.music.ui;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MusicSeekBar$2
  implements SeekBar.OnSeekBarChangeListener
{
  MusicSeekBar$2(MusicSeekBar paramMusicSeekBar)
  {
  }

  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
  }

  public final void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    this.oPl.oPh = true;
  }

  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    AppMethodBeat.i(105126);
    this.oPl.oPh = false;
    if (MusicSeekBar.b(this.oPl) != null)
      MusicSeekBar.b(this.oPl).zV(paramSeekBar.getProgress());
    AppMethodBeat.o(105126);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicSeekBar.2
 * JD-Core Version:    0.6.2
 */