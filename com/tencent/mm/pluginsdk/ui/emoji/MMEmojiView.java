package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.gif.MMGIFException;
import com.tencent.mm.plugin.gif.b;
import com.tencent.mm.plugin.gif.c;
import com.tencent.mm.plugin.gif.h;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.IOException;

public class MMEmojiView extends MMAnimateView
{
  protected EmojiInfo kZa;
  private int mScreenWidth;
  protected int vpE;
  protected int vpF;
  private boolean vpG;
  private boolean vpH;
  private boolean vpI;

  public MMEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    AppMethodBeat.i(62475);
    init(paramContext);
    AppMethodBeat.o(62475);
  }

  public MMEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62476);
    this.vpG = false;
    this.vpH = false;
    this.vpI = false;
    init(paramContext);
    AppMethodBeat.o(62476);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(62477);
    this.vpE = paramContext.getResources().getDimensionPixelSize(2131428381);
    this.vpF = paramContext.getResources().getDimensionPixelSize(2131428379);
    this.mScreenWidth = a.gd(paramContext);
    setAdjustViewBounds(true);
    setMaxWidth(this.vpE);
    setMaxHeight(this.vpE);
    setMinimumWidth(this.vpF);
    setMinimumHeight(this.vpF);
    AppMethodBeat.o(62477);
  }

  public final void a(EmojiInfo paramEmojiInfo, String paramString)
  {
    AppMethodBeat.i(62478);
    this.kZa = paramEmojiInfo;
    Object localObject = paramEmojiInfo.dve();
    if ((paramEmojiInfo.field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB)
      if (c.bFN().Ox(paramString) != null)
      {
        setImageDrawable(c.bFN().Ox(paramString));
        AppMethodBeat.o(62478);
      }
    while (true)
    {
      return;
      paramEmojiInfo = this.kZa;
      localObject = ((PluginEmoji)g.M(PluginEmoji.class)).getProvider().l(this.kZa);
      this.kZa = paramEmojiInfo;
      try
      {
        if (!bo.cb((byte[])localObject))
        {
          if (!bo.isNullOrNil(paramString))
          {
            setCacheKey(paramString);
            paramString = c.bFN().x(getCacheKey(), (byte[])localObject);
          }
          while (true)
          {
            setImageDrawable(paramString);
            AppMethodBeat.o(62478);
            break;
            if ((!r.bU((byte[])localObject)) || (!((PluginEmoji)g.M(PluginEmoji.class)).getProvider().bjX()))
              break label240;
            paramEmojiInfo = new com/tencent/mm/plugin/gif/h;
            paramEmojiInfo.<init>((byte[])localObject);
            this.vpH = true;
            paramString = paramEmojiInfo;
            if (!paramEmojiInfo.isRunning())
            {
              paramEmojiInfo.reset();
              paramString = paramEmojiInfo;
            }
          }
        }
      }
      catch (MMGIFException paramEmojiInfo)
      {
        while (true)
        {
          a(paramEmojiInfo);
          if (paramEmojiInfo.getErrorCode() != 103)
            break label362;
          ab.d("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray D_GIF_ERR_NOT_GIF_FILE");
          paramEmojiInfo = com.tencent.mm.sdk.platformtools.d.bQ((byte[])localObject);
          if (paramEmojiInfo == null)
            break label311;
          paramEmojiInfo.setDensity(getEmojiDensity());
          setImageBitmap(paramEmojiInfo);
          AppMethodBeat.o(62478);
          break;
          ab.v("MicroMsg.emoji.MMEmojiView", "set with gif");
          paramEmojiInfo = new com.tencent.mm.plugin.gif.d((byte[])localObject);
        }
      }
      catch (IOException paramEmojiInfo)
      {
        ab.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", new Object[] { paramEmojiInfo.toString() });
        while (true)
        {
          if (this.kZa != null)
          {
            this.kZa.duQ();
            ab.i("MicroMsg.emoji.MMEmojiView", "delete file.");
          }
          init();
          AppMethodBeat.o(62478);
          break;
          ab.w("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", new Object[] { localObject.toString() });
          if (this.kZa != null)
          {
            this.kZa.duQ();
            ab.i("MicroMsg.emoji.MMEmojiView", "delete file.");
          }
          init();
          AppMethodBeat.o(62478);
          break;
          ab.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", new Object[] { paramEmojiInfo.toString() });
          if (this.kZa != null)
          {
            this.kZa.duQ();
            ab.i("MicroMsg.emoji.MMEmojiView", "delete file.");
          }
        }
      }
      catch (NullPointerException paramEmojiInfo)
      {
        label311: label362: 
        while (true)
          label240: ab.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", new Object[] { paramEmojiInfo.toString() });
      }
      eE((String)localObject, paramString);
      AppMethodBeat.o(62478);
    }
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(62479);
    super.setImageDrawable(paramDrawable);
    float f1;
    if ((paramDrawable != null) && (this.kZa != null))
    {
      f1 = 1.0F;
      if (!(paramDrawable instanceof com.tencent.mm.plugin.gif.d))
        break label130;
      f1 = ((com.tencent.mm.plugin.gif.d)paramDrawable).getEmojiDensityScale();
      float f2 = paramDrawable.getIntrinsicWidth() / f1;
      f1 = paramDrawable.getIntrinsicHeight() / f1;
      if ((this.vpI) && ((this.kZa.field_width == 0) || (this.kZa.field_height == 0)))
      {
        this.kZa.field_width = ((int)f2);
        this.kZa.field_height = ((int)f1);
        ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().updateEmojiInfo(this.kZa);
      }
    }
    AppMethodBeat.o(62479);
    while (true)
    {
      return;
      label130: if ((paramDrawable instanceof h))
      {
        f1 = ((h)paramDrawable).getEmojiDensityScale();
        break;
      }
      if ((paramDrawable instanceof BitmapDrawable))
        break;
      AppMethodBeat.o(62479);
    }
  }

  public void setIsMaxSizeLimit(boolean paramBoolean)
  {
    AppMethodBeat.i(62480);
    this.vpG = paramBoolean;
    if (paramBoolean)
    {
      setAdjustViewBounds(true);
      setMaxWidth(this.vpE);
      setMaxHeight(this.vpE);
      AppMethodBeat.o(62480);
    }
    while (true)
    {
      return;
      setMaxHeight(2147483647);
      setMaxHeight(2147483647);
      AppMethodBeat.o(62480);
    }
  }

  public void setMaxSize(int paramInt)
  {
    this.vpE = paramInt;
  }

  public void setUpdateEmojiSize(boolean paramBoolean)
  {
    this.vpI = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView
 * JD-Core Version:    0.6.2
 */