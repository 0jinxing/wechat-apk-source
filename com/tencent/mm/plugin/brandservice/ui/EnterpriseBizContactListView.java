package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.m.a;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.protocal.protobuf.lk;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.sortview.BaseSortView;
import com.tencent.mm.ui.base.sortview.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EnterpriseBizContactListView extends BaseSortView
{
  private ListView gGW;
  private String jLN;
  private boolean jLT;
  private int jLU = -1;
  private EnterpriseBizContactListView.b jLV;
  private EnterpriseBizContactListView.a jLW;
  private int jLX = 0;
  private int jLY = 0;

  public EnterpriseBizContactListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private List<com.tencent.mm.ui.base.sortview.d> getSortEntityList()
  {
    AppMethodBeat.i(13969);
    ArrayList localArrayList = new ArrayList();
    z.aeR();
    Cursor localCursor = e.F(this.jLN, this.jLT);
    while (localCursor.moveToNext())
    {
      lk locallk = new lk();
      Object localObject;
      if (localCursor != null)
      {
        localObject = new ad();
        ((ad)localObject).d(localCursor);
        com.tencent.mm.aj.d locald = new com.tencent.mm.aj.d();
        locald.d(localCursor);
        locallk.userName = ((ap)localObject).field_username;
        locallk.ehM = ((ad)localObject);
        locallk.pkW = locald;
      }
      if (locallk.ehM != null)
      {
        localObject = new com.tencent.mm.ui.base.sortview.d();
        ((com.tencent.mm.ui.base.sortview.d)localObject).data = locallk;
        if (locallk.pkW.adR())
          ((com.tencent.mm.ui.base.sortview.d)localObject).yDG = "!1";
        while (true)
        {
          localArrayList.add(localObject);
          break;
          if (locallk.ehM.Oe())
          {
            ((com.tencent.mm.ui.base.sortview.d)localObject).yDG = "!2";
          }
          else
          {
            int i = locallk.ehM.Ny();
            int j = i;
            if (i >= 97)
            {
              j = i;
              if (i <= 122)
                j = i - 32;
            }
            if ((j >= 65) && (j <= 90))
              ((com.tencent.mm.ui.base.sortview.d)localObject).yDG = ((char)j);
            else
              ((com.tencent.mm.ui.base.sortview.d)localObject).yDG = "#";
          }
        }
      }
    }
    localCursor.close();
    this.jLU = localArrayList.size();
    Collections.sort(localArrayList, new d((byte)0));
    AppMethodBeat.o(13969);
    return localArrayList;
  }

  public static void release()
  {
    AppMethodBeat.i(13970);
    z.afb().aeL();
    AppMethodBeat.o(13970);
  }

  public final boolean a(String paramString, com.tencent.mm.ui.base.sortview.d paramd)
  {
    AppMethodBeat.i(13971);
    Object localObject;
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (paramd != null))
    {
      localObject = (lk)paramd.data;
      if (localObject == null)
      {
        AppMethodBeat.o(13971);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      paramd = ((lk)localObject).ehM.Oj();
      String str = ((lk)localObject).ehM.Ht();
      localObject = ((lk)localObject).ehM.Hu();
      paramString = paramString.toUpperCase();
      if (((!bo.isNullOrNil(paramd)) && (paramd.toUpperCase().indexOf(paramString) != -1)) || ((!bo.isNullOrNil(str)) && (str.toUpperCase().indexOf(paramString) != -1)) || ((!bo.isNullOrNil((String)localObject)) && (((String)localObject).toUpperCase().startsWith(paramString))))
      {
        bool = true;
        AppMethodBeat.o(13971);
      }
      else
      {
        AppMethodBeat.o(13971);
        bool = false;
      }
    }
  }

  public final void aWg()
  {
    AppMethodBeat.i(13968);
    setOnItemClickListener(new EnterpriseBizContactListView.1(this));
    if (getMode() == 0)
      setOnItemLongClickListener(new EnterpriseBizContactListView.2(this));
    AppMethodBeat.o(13968);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(13967);
    if (paramMotionEvent.getAction() == 0)
    {
      this.jLX = ((int)paramMotionEvent.getRawX());
      this.jLY = ((int)paramMotionEvent.getRawY());
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(13967);
    return bool;
  }

  public int getContactCount()
  {
    return this.jLU;
  }

  public c.a getItemViewCreator()
  {
    AppMethodBeat.i(13976);
    EnterpriseBizContactListView.3 local3 = new EnterpriseBizContactListView.3(this);
    AppMethodBeat.o(13976);
    return local3;
  }

  public ListView getListView()
  {
    AppMethodBeat.i(13974);
    this.gGW = ((ListView)findViewById(2131821698));
    ListView localListView = this.gGW;
    AppMethodBeat.o(13974);
    return localListView;
  }

  public View getNoResultView()
  {
    AppMethodBeat.i(13975);
    TextView localTextView = (TextView)findViewById(2131821905);
    localTextView.setText(2131299227);
    AppMethodBeat.o(13975);
    return localTextView;
  }

  public VerticalScrollBar getScrollBar()
  {
    AppMethodBeat.i(13973);
    VerticalScrollBar localVerticalScrollBar = (VerticalScrollBar)findViewById(2131821699);
    AppMethodBeat.o(13973);
    return localVerticalScrollBar;
  }

  public final View inflate()
  {
    AppMethodBeat.i(13972);
    View localView = View.inflate(getContext(), 2130969398, this);
    AppMethodBeat.o(13972);
    return localView;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(13977);
    if (this.jLV != null)
      this.jLV.aWe();
    boolean bool;
    if (super.onInterceptTouchEvent(paramMotionEvent))
    {
      bool = true;
      AppMethodBeat.o(13977);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(13977);
    }
  }

  public final void refresh()
  {
    AppMethodBeat.i(13966);
    dJ(getSortEntityList());
    super.refresh();
    AppMethodBeat.o(13966);
  }

  public void setExcludeBizChat(boolean paramBoolean)
  {
    this.jLT = paramBoolean;
  }

  public void setFatherBizName(String paramString)
  {
    this.jLN = paramString;
  }

  public void setOnTouchListener(EnterpriseBizContactListView.b paramb)
  {
    this.jLV = paramb;
  }

  final class d
    implements Comparator<com.tencent.mm.ui.base.sortview.d>
  {
    private d()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView
 * JD-Core Version:    0.6.2
 */