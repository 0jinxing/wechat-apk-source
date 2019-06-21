package com.tencent.mm.emoji.view;

import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.loader.a;
import com.tencent.mm.emoji.loader.d.h.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/view/EmojiStatusView;", "Lcom/tencent/mm/emoji/view/BaseEmojiView;", "Lcom/tencent/mm/emoji/loader/request/Request$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "emojiInfo", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "setEmojiInfo", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "status", "getStatus", "()I", "setStatus", "(I)V", "statusListener", "Lcom/tencent/mm/emoji/view/EmojiStatusView$StatusListener;", "getStatusListener", "()Lcom/tencent/mm/emoji/view/EmojiStatusView$StatusListener;", "setStatusListener", "(Lcom/tencent/mm/emoji/view/EmojiStatusView$StatusListener;)V", "destroy", "", "onDetachedFromWindow", "onResult", "success", "", "reload", "setStatusNotify", "Companion", "StatusListener", "plugin-emojisdk_release"})
public class EmojiStatusView extends BaseEmojiView
  implements h.a
{
  public static final a eAo;
  private EmojiStatusView.b eAn;
  private EmojiInfo exP;
  private int status;

  static
  {
    AppMethodBeat.i(63316);
    eAo = new a((byte)0);
    AppMethodBeat.o(63316);
  }

  public EmojiStatusView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public EmojiStatusView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void bV(boolean paramBoolean)
  {
    AppMethodBeat.i(63314);
    if (paramBoolean);
    for (int i = 1; ; i = -1)
    {
      setStatusNotify(i);
      AppMethodBeat.o(63314);
      return;
    }
  }

  public EmojiInfo getEmojiInfo()
  {
    return this.exP;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final EmojiStatusView.b getStatusListener()
  {
    return this.eAn;
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(63315);
    ab.i("MicroMsg.EmojiStatusView", "destroy: ".concat(String.valueOf(this)));
    a locala = a.exs;
    a.cf((View)this);
    this.eAn = null;
    super.onDetachedFromWindow();
    AppMethodBeat.o(63315);
  }

  public void reload()
  {
    AppMethodBeat.i(63312);
    Object localObject = getEmojiInfo();
    if (localObject != null)
    {
      ab.i("MicroMsg.EmojiStatusView", "reload: " + ((EmojiInfo)localObject).Aq());
      setStatusNotify(0);
      a locala = a.exs;
      a.a((EmojiInfo)localObject, (BaseEmojiView)this, (h.a)this);
      AppMethodBeat.o(63312);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.EmojiStatusView", "reload: emojiInfo is null");
      localObject = a.exs;
      a.cf((View)this);
      AppMethodBeat.o(63312);
    }
  }

  public void setEmojiInfo(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63311);
    this.exP = paramEmojiInfo;
    reload();
    AppMethodBeat.o(63311);
  }

  public final void setStatus(int paramInt)
  {
    this.status = paramInt;
  }

  public final void setStatusListener(EmojiStatusView.b paramb)
  {
    this.eAn = paramb;
  }

  public final void setStatusNotify(int paramInt)
  {
    AppMethodBeat.i(63313);
    this.status = paramInt;
    EmojiStatusView.b localb = this.eAn;
    if (localb != null)
    {
      localb.jm(paramInt);
      AppMethodBeat.o(63313);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(63313);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/view/EmojiStatusView$Companion;", "", "()V", "StatusFail", "", "StatusLoading", "StatusSuccess", "plugin-emojisdk_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.view.EmojiStatusView
 * JD-Core Version:    0.6.2
 */