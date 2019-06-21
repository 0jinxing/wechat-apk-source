package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHeaderView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "avatarIv", "Landroid/widget/ImageView;", "getAvatarIv", "()Landroid/widget/ImageView;", "setAvatarIv", "(Landroid/widget/ImageView;)V", "nickNameTv", "Landroid/widget/TextView;", "getNickNameTv", "()Landroid/widget/TextView;", "setNickNameTv", "(Landroid/widget/TextView;)V", "setUserName", "", "user", "", "plugin-story_release"})
public final class GalleryHeaderView extends RelativeLayout
{
  private ImageView eks;
  private TextView gtO;

  public GalleryHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110712);
    AppMethodBeat.o(110712);
  }

  public GalleryHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110711);
    View.inflate(paramContext, 2130970885, (ViewGroup)this);
    this.eks = ((ImageView)findViewById(2131821183));
    this.gtO = ((TextView)findViewById(2131823149));
    setPadding(0, 0, 0, ak.fr(paramContext));
    AppMethodBeat.o(110711);
  }

  public final ImageView getAvatarIv()
  {
    return this.eks;
  }

  public final TextView getNickNameTv()
  {
    return this.gtO;
  }

  public final void setAvatarIv(ImageView paramImageView)
  {
    this.eks = paramImageView;
  }

  public final void setNickNameTv(TextView paramTextView)
  {
    this.gtO = paramTextView;
  }

  public final void setUserName(String paramString)
  {
    AppMethodBeat.i(110710);
    if (paramString != null)
    {
      Object localObject = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject, "MMKernel.service(IMessengerStorage::class.java)");
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().aoO(paramString);
      TextView localTextView = this.gtO;
      if (localTextView != null)
      {
        Context localContext = getContext();
        a.f.b.j.o(localObject, "contact");
        localTextView.setText((CharSequence)com.tencent.mm.pluginsdk.ui.e.j.b(localContext, (CharSequence)((ad)localObject).Oj(), localTextView.getTextSize()));
      }
      a.b.b(this.eks, paramString, 0.5F);
    }
    AppMethodBeat.o(110710);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.GalleryHeaderView
 * JD-Core Version:    0.6.2
 */