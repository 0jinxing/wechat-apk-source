package com.tencent.mm.emoji.view;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.gif.MMGIFException;
import com.tencent.mm.plugin.gif.b;
import com.tencent.mm.plugin.gif.h;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.IOException;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/view/BaseEmojiView;", "Lcom/tencent/mm/plugin/gif/MMAnimateView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "value", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "emojiInfo", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "setEmojiInfo", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "isHevc", "", "setMMGIFFileByteArray", "", "bytes", "", "plugin-emojisdk_release"})
public class BaseEmojiView extends MMAnimateView
{
  private final String TAG = "MicroMsg.BaseEmojiView";
  public boolean eAi;
  private EmojiInfo exP;

  public BaseEmojiView(Context paramContext)
  {
    this(paramContext, null);
  }

  public BaseEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public BaseEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private final void setMMGIFFileByteArray(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(63305);
    try
    {
      if (!bo.cb(paramArrayOfByte))
      {
        Object localObject;
        if (r.bU(paramArrayOfByte))
        {
          localObject = g.M(PluginEmoji.class);
          j.o(localObject, "MMKernel.plugin(PluginEmoji::class.java)");
          localObject = ((PluginEmoji)localObject).getProvider();
          j.o(localObject, "MMKernel.plugin(PluginEmoji::class.java).provider");
          if (((e)localObject).bjX())
          {
            localObject = new com/tencent/mm/plugin/gif/h;
            ((h)localObject).<init>(paramArrayOfByte);
            localObject = (b)localObject;
            this.eAi = true;
          }
        }
        while (true)
        {
          if (!((b)localObject).isRunning())
            ((b)localObject).reset();
          setImageDrawable((Drawable)localObject);
          AppMethodBeat.o(63305);
          return;
          ab.v(this.TAG, "set with gif");
          localObject = new com/tencent/mm/plugin/gif/d;
          ((com.tencent.mm.plugin.gif.d)localObject).<init>(paramArrayOfByte);
          localObject = (b)localObject;
        }
      }
    }
    catch (MMGIFException localMMGIFException)
    {
      while (true)
      {
        a(localMMGIFException);
        Bitmap localBitmap;
        if (localMMGIFException.getErrorCode() == 103)
        {
          ab.d(this.TAG, "setMMGIFFileByteArray D_GIF_ERR_NOT_GIF_FILE");
          localBitmap = com.tencent.mm.sdk.platformtools.d.bQ(paramArrayOfByte);
          if (localBitmap != null)
          {
            localBitmap.setDensity(getEmojiDensity());
            setImageBitmap(localBitmap);
            AppMethodBeat.o(63305);
          }
          else
          {
            ab.w(this.TAG, "setMMGIFFileByteArray failed bitmap is null. bytes %s", new Object[] { String.valueOf(paramArrayOfByte) });
            paramArrayOfByte = getEmojiInfo();
            if (paramArrayOfByte != null)
              paramArrayOfByte.duQ();
            init();
            AppMethodBeat.o(63305);
          }
        }
        else
        {
          ab.e(this.TAG, "setMMGIFFileByteArray failed. %s", new Object[] { localBitmap.toString() });
          paramArrayOfByte = getEmojiInfo();
          if (paramArrayOfByte != null)
            paramArrayOfByte.duQ();
          init();
          AppMethodBeat.o(63305);
        }
      }
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
        ab.e(this.TAG, "setMMGIFFileByteArray failed. %s", new Object[] { paramArrayOfByte.toString() });
    }
    catch (NullPointerException paramArrayOfByte)
    {
      while (true)
        ab.e(this.TAG, "setMMGIFFileByteArray failed. %s", new Object[] { paramArrayOfByte.toString() });
    }
  }

  public EmojiInfo getEmojiInfo()
  {
    return this.exP;
  }

  public void setEmojiInfo(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63304);
    if (j.j(this.exP, paramEmojiInfo))
      AppMethodBeat.o(63304);
    while (true)
    {
      return;
      this.exP = paramEmojiInfo;
      if (paramEmojiInfo != null)
      {
        String str = paramEmojiInfo.dve();
        if ((paramEmojiInfo.getGroup() == EmojiGroupInfo.yad) || (paramEmojiInfo.getGroup() == EmojiInfo.yak) || (paramEmojiInfo.getGroup() == EmojiInfo.yaj))
        {
          setImageBitmap(paramEmojiInfo.w(getContext(), 300));
          AppMethodBeat.o(63304);
        }
        else if (paramEmojiInfo.duS())
        {
          b(EmojiInfo.bJ(getContext(), paramEmojiInfo.getName()), "");
          AppMethodBeat.o(63304);
        }
        else if ((paramEmojiInfo.duX() & EmojiInfo.yaB) == EmojiInfo.yaB)
        {
          paramEmojiInfo = g.M(PluginEmoji.class);
          j.o(paramEmojiInfo, "MMKernel.plugin(PluginEmoji::class.java)");
          setMMGIFFileByteArray(((PluginEmoji)paramEmojiInfo).getProvider().l(getEmojiInfo()));
          AppMethodBeat.o(63304);
        }
        else
        {
          eE(str, "");
        }
      }
      else
      {
        AppMethodBeat.o(63304);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.view.BaseEmojiView
 * JD-Core Version:    0.6.2
 */