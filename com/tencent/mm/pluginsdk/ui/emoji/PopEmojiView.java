package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.emotion.EmojiInfo;

public class PopEmojiView extends LinearLayout
{
  private ViewGroup ius;
  private MMEmojiView vpJ;
  private ProgressBar vpK;

  public PopEmojiView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(62481);
    init(paramContext);
    AppMethodBeat.o(62481);
  }

  public PopEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(62482);
    init(paramContext);
    AppMethodBeat.o(62482);
  }

  public PopEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62483);
    init(paramContext);
    AppMethodBeat.o(62483);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(62484);
    this.ius = ((ViewGroup)inflate(getContext(), 2130970375, null));
    this.vpJ = ((MMEmojiView)this.ius.findViewById(2131820629));
    this.vpJ.setIsMaxSizeLimit(true);
    this.vpJ.setMaxSize(paramContext.getResources().getDimensionPixelSize(2131428381) - paramContext.getResources().getDimensionPixelSize(2131427796) * 3);
    this.vpK = ((ProgressBar)this.ius.findViewById(2131821370));
    addView(this.ius, -1, -1);
    AppMethodBeat.o(62484);
  }

  public void setEmojiInfo(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62486);
    if (this.vpJ != null)
      this.vpJ.a(paramEmojiInfo, "");
    AppMethodBeat.o(62486);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(62487);
    if ((this.vpJ != null) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      paramBitmap.setDensity(this.vpJ.getEmojiDensity());
      this.vpJ.setImageBitmap(paramBitmap);
    }
    AppMethodBeat.o(62487);
  }

  public void setImageResource(int paramInt)
  {
    AppMethodBeat.i(62485);
    if (this.vpJ != null)
      this.vpJ.setImageResource(paramInt);
    AppMethodBeat.o(62485);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.emoji.PopEmojiView
 * JD-Core Version:    0.6.2
 */