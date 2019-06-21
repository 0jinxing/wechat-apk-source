package com.tencent.mm.plugin.talkroom.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMHorList;
import java.util.List;

public class TalkRoomAvatarsFrame extends FrameLayout
{
  private ak mHandler;
  private String nMN;
  private final int nMz;
  private final int szg;
  private final int szh;
  private MMHorList szi;
  private TalkRoomAvatarsFrame.a szj;
  private ap szk;

  public TalkRoomAvatarsFrame(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(25900);
    this.szg = 2000;
    this.szh = 5;
    this.nMz = a.fromDPToPix(null, 58);
    initView();
    AppMethodBeat.o(25900);
  }

  public TalkRoomAvatarsFrame(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(25901);
    this.szg = 2000;
    this.szh = 5;
    this.nMz = a.fromDPToPix(null, 58);
    initView();
    AppMethodBeat.o(25901);
  }

  private void bJk()
  {
    AppMethodBeat.i(25905);
    this.szj.nMN = this.nMN;
    if (bo.isNullOrNil(this.nMN))
    {
      this.szj.notifyDataSetChanged();
      AppMethodBeat.o(25905);
    }
    while (true)
    {
      return;
      if (this.szi.getIsTouching())
      {
        AppMethodBeat.o(25905);
      }
      else
      {
        int i = this.szj.indexOf(this.nMN) * this.nMz;
        int j = this.szi.getCurrentPosition();
        if (i < j)
        {
          this.szi.NI(i);
          AppMethodBeat.o(25905);
        }
        else if (i > j + this.nMz * 4)
        {
          this.szi.NI(i - this.nMz * 4);
          AppMethodBeat.o(25905);
        }
        else
        {
          this.szj.notifyDataSetChanged();
          AppMethodBeat.o(25905);
        }
      }
    }
  }

  private void initView()
  {
    AppMethodBeat.i(25902);
    inflate(getContext(), 2130970915, this);
    this.szi = ((MMHorList)findViewById(2131828215));
    this.szi.setOverScrollEnabled(true);
    this.szi.setCenterInParent(true);
    this.szi.setItemWidth(this.nMz);
    this.szj = new TalkRoomAvatarsFrame.a(getContext());
    this.szi.setAdapter(this.szj);
    this.mHandler = new ak(Looper.getMainLooper());
    this.szi.setHorListLitener(new TalkRoomAvatarsFrame.1(this));
    this.szk = new ap(new TalkRoomAvatarsFrame.2(this), false);
    AppMethodBeat.o(25902);
  }

  public void setCurMemeber(String paramString)
  {
    AppMethodBeat.i(25904);
    if (this.szi == null)
      AppMethodBeat.o(25904);
    while (true)
    {
      return;
      if ((bo.isNullOrNil(this.nMN)) && (bo.isNullOrNil(paramString)))
      {
        AppMethodBeat.o(25904);
      }
      else if ((!bo.isNullOrNil(this.nMN)) && (this.nMN.equals(paramString)))
      {
        AppMethodBeat.o(25904);
      }
      else
      {
        this.nMN = paramString;
        bJk();
        AppMethodBeat.o(25904);
      }
    }
  }

  public void setMembersList(List<String> paramList)
  {
    AppMethodBeat.i(25903);
    if (this.szj == null)
    {
      AppMethodBeat.o(25903);
      return;
    }
    TalkRoomAvatarsFrame.a locala = this.szj;
    if (paramList == null)
      locala.szn.clear();
    while (true)
    {
      locala.notifyDataSetChanged();
      AppMethodBeat.o(25903);
      break;
      locala.szn = paramList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame
 * JD-Core Version:    0.6.2
 */