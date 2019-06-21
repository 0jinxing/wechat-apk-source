package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.protocal.protobuf.EmotionDonor;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.LinkedList;

public class DonorsAvatarView extends LinearLayout
{
  private int lcQ;
  private int lcR;
  private int lcS;
  private int lcT;
  private LinearLayout.LayoutParams lcU;
  private int mMaxCount;

  public DonorsAvatarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(53567);
    init();
    AppMethodBeat.o(53567);
  }

  public DonorsAvatarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(53568);
    init();
    AppMethodBeat.o(53568);
  }

  private void init()
  {
    AppMethodBeat.i(53569);
    setOrientation(0);
    this.lcQ = com.tencent.mm.bz.a.gd(getContext());
    this.lcR = com.tencent.mm.bz.a.al(getContext(), 2131428341);
    this.lcS = com.tencent.mm.bz.a.al(getContext(), 2131427500);
    this.lcT = com.tencent.mm.bz.a.al(getContext(), 2131427812);
    this.lcU = new LinearLayout.LayoutParams(this.lcR, this.lcR);
    this.lcU.leftMargin = this.lcS;
    this.lcU.rightMargin = this.lcS;
    this.mMaxCount = ((this.lcQ - this.lcT * 2) / (this.lcR + this.lcS * 2));
    ab.i("MicroMsg.emoji.DonorsAvatarView", "max count:%d", new Object[] { Integer.valueOf(this.mMaxCount) });
    AppMethodBeat.o(53569);
  }

  public final void c(String paramString, LinkedList<EmotionDonor> paramLinkedList)
  {
    AppMethodBeat.i(53570);
    removeAllViews();
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      int i;
      int j;
      label39: ImageView localImageView;
      if (paramLinkedList.size() > this.mMaxCount)
      {
        i = this.mMaxCount;
        j = 0;
        if (j >= i)
          break label184;
        EmotionDonor localEmotionDonor = (EmotionDonor)paramLinkedList.get(j);
        if (localEmotionDonor != null)
        {
          localImageView = new ImageView(getContext());
          localImageView.setLayoutParams(this.lcU);
          if (bo.isNullOrNil(localEmotionDonor.HeadUrl))
            break label140;
          o.ahp().a(localEmotionDonor.HeadUrl, localImageView, g.l(paramString, localEmotionDonor.HeadUrl, new Object[0]));
        }
      }
      while (true)
      {
        addView(localImageView);
        j++;
        break label39;
        i = paramLinkedList.size();
        break;
        try
        {
          label140: localImageView.setImageBitmap(BackwardSupportUtil.b.b(ah.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bz.a.getDensity(null)));
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace("MicroMsg.emoji.DonorsAvatarView", localIOException, "", new Object[0]);
        }
      }
    }
    label184: AppMethodBeat.o(53570);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.DonorsAvatarView
 * JD-Core Version:    0.6.2
 */