package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class GameMediaList extends LinearLayout
  implements View.OnClickListener
{
  private String appId = "";
  private int lTe = -1;
  private Context mContext;
  private int nja = 0;
  private int nkE;
  private LinkedList<String> nkF;

  public GameMediaList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void l(Context paramContext, String paramString, int paramInt)
  {
    this.appId = paramString;
    this.lTe = 12;
    this.nja = paramInt;
    this.mContext = paramContext;
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(112066);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof a)))
    {
      ab.i("MicroMsg.GameMediaList", "Invalid tag");
      AppMethodBeat.o(112066);
      return;
    }
    paramView = (a)paramView.getTag();
    switch (paramView.type)
    {
    default:
    case 1:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(112066);
      break;
      c.ax(getContext(), paramView.url);
      b.a(this.mContext, this.lTe, 1202, 1, 13, this.appId, this.nja, null);
      AppMethodBeat.o(112066);
      break;
      paramView = paramView.url;
      int i = this.nkF.indexOf(paramView);
      int j = i;
      if (i < 0)
        j = 0;
      Intent localIntent = new Intent(getContext(), GameGalleryUI.class);
      paramView = new String[this.nkF.size()];
      this.nkF.toArray(paramView);
      localIntent.putExtra("URLS", paramView);
      localIntent.putExtra("CURRENT", j);
      localIntent.putExtra("REPORT_APPID", this.appId);
      localIntent.putExtra("REPORT_SCENE", this.lTe);
      localIntent.putExtra("SOURCE_SCENE", this.nja);
      getContext().startActivity(localIntent);
    }
  }

  public void setItemLayout(int paramInt)
  {
    this.nkE = paramInt;
  }

  public void setMediaList(LinkedList<a> paramLinkedList)
  {
    AppMethodBeat.i(112065);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      setVisibility(8);
      AppMethodBeat.o(112065);
    }
    while (true)
    {
      return;
      this.nkF = new LinkedList();
      Object localObject;
      for (int i = 0; i < paramLinkedList.size(); i++)
      {
        localObject = (a)paramLinkedList.get(i);
        if ((!bo.isNullOrNil(((a)localObject).url)) && (((a)localObject).type == 0))
          this.nkF.add(((a)localObject).url);
      }
      removeAllViews();
      LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
      for (i = 0; i < paramLinkedList.size(); i++)
      {
        a locala = (a)paramLinkedList.get(i);
        if (!bo.isNullOrNil(locala.nkG))
        {
          View localView = localLayoutInflater.inflate(this.nkE, this, false);
          ImageView localImageView = (ImageView)localView.findViewById(2131822355);
          a locala1 = o.ahp();
          String str = locala.nkG;
          localObject = new c.a();
          ((c.a)localObject).ePG = true;
          locala1.a(str, localImageView, ((c.a)localObject).ahG());
          if (locala.type == 1)
            localView.findViewById(2131824563).setVisibility(0);
          addView(localView);
          localImageView.setTag(locala);
          localImageView.setOnClickListener(this);
        }
      }
      setVisibility(0);
      AppMethodBeat.o(112065);
    }
  }

  public static final class a
  {
    public String nkG;
    public int type;
    public String url;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMediaList
 * JD-Core Version:    0.6.2
 */