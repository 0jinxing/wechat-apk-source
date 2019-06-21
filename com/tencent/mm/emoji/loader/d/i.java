package com.tencent.mm.emoji.loader.d;

import a.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/request/ViewRequest;", "V", "Landroid/view/View;", "Lcom/tencent/mm/emoji/loader/request/Request;", "Landroid/graphics/drawable/Drawable;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "view", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Landroid/view/View;)V", "weakView", "Ljava/lang/ref/WeakReference;", "getWeakView", "()Ljava/lang/ref/WeakReference;", "setWeakView", "(Ljava/lang/ref/WeakReference;)V", "cancel", "", "onLoad", "success", "", "Companion", "plugin-emojisdk_release"})
public abstract class i<V extends View> extends h<Drawable>
{
  private static final int eyj = 2131820596;
  public static final a eyk = new a((byte)0);
  WeakReference<V> eyi;

  public i(EmojiInfo paramEmojiInfo, V paramV)
  {
    super(paramEmojiInfo);
    this.eyi = new WeakReference(paramV);
    paramEmojiInfo = (h)paramV.getTag(eyj);
    if (paramEmojiInfo != null)
      paramEmojiInfo.cancel();
    paramV.setTag(eyj, this);
  }

  public void bX(boolean paramBoolean)
  {
    Object localObject = this.eyi;
    if (localObject != null);
    for (localObject = (View)((WeakReference)localObject).get(); ; localObject = null)
    {
      if (localObject != null)
        ((View)localObject).setTag(eyj, null);
      return;
    }
  }

  public void cancel()
  {
    super.cancel();
    Object localObject = this.eyi;
    if (localObject != null);
    for (localObject = (View)((WeakReference)localObject).get(); ; localObject = null)
    {
      if (localObject != null)
        ((View)localObject).setTag(eyj, null);
      this.eyi = null;
      return;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/request/ViewRequest$Companion;", "", "()V", "TAG_ID", "", "getTAG_ID", "()I", "plugin-emojisdk_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.d.i
 * JD-Core Version:    0.6.2
 */