package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public class ConsolePanel extends FrameLayout
  implements com.tencent.mm.plugin.appbrand.wxawidget.a
{
  MRecyclerView iIE;
  final List<LogInfo> jpE;
  EditText jpK;
  Button[] jpL;
  Button jpM;
  Button jpN;
  a jpO;
  int jpP;
  String jpQ;

  public ConsolePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(11146);
    this.jpE = new LinkedList();
    initialize();
    AppMethodBeat.o(11146);
  }

  public ConsolePanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(11147);
    this.jpE = new LinkedList();
    initialize();
    AppMethodBeat.o(11147);
  }

  private boolean EX(String paramString)
  {
    AppMethodBeat.i(11152);
    boolean bool;
    if ((!bo.isNullOrNil(this.jpQ)) && ((paramString == null) || (!paramString.toLowerCase().contains(this.jpQ.toLowerCase()))))
    {
      bool = true;
      AppMethodBeat.o(11152);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11152);
    }
  }

  private void dx(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(11150);
    Button localButton = (Button)findViewById(paramInt2);
    localButton.setOnClickListener(new ConsolePanel.8(this));
    this.jpL[paramInt1] = localButton;
    AppMethodBeat.o(11150);
  }

  private void initialize()
  {
    AppMethodBeat.i(11148);
    LayoutInflater.from(getContext()).inflate(2130969194, this, true);
    this.jpK = ((EditText)findViewById(2131822954));
    this.jpK.clearFocus();
    this.jpL = new Button[5];
    dx(0, 2131822958);
    dx(1, 2131822959);
    dx(2, 2131822960);
    dx(3, 2131822961);
    dx(4, 2131822962);
    this.jpL[0].setSelected(true);
    this.jpP = 0;
    this.jpM = ((Button)findViewById(2131822956));
    this.jpN = ((Button)findViewById(2131822957));
    this.jpN.setEnabled(false);
    this.jpM.setOnClickListener(new ConsolePanel.1(this));
    this.jpN.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
      }
    });
    this.jpK.addTextChangedListener(new ConsolePanel.3(this));
    this.jpK.setOnKeyListener(new ConsolePanel.4(this));
    this.jpK.setOnFocusChangeListener(new ConsolePanel.5(this));
    findViewById(2131822955).setOnClickListener(new ConsolePanel.6(this));
    setOnTouchListener(new ConsolePanel.7(this));
    this.iIE = ((MRecyclerView)findViewById(2131822963));
    this.jpO = new a(getContext());
    MRecyclerView localMRecyclerView = this.iIE;
    getContext();
    localMRecyclerView.setLayoutManager(new LinearLayoutManager());
    this.iIE.setItemAnimator(null);
    this.iIE.setAdapter(this.jpO);
    AppMethodBeat.o(11148);
  }

  public final void aS(List<LogInfo> paramList)
  {
    AppMethodBeat.i(11151);
    if (paramList == null)
      AppMethodBeat.o(11151);
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; i < paramList.size(); i++)
      {
        LogInfo localLogInfo = (LogInfo)paramList.get(i);
        this.jpE.add(localLogInfo);
        if (((localLogInfo.level == this.jpP) || (this.jpP == 0)) && (!EX(localLogInfo.message)))
          localLinkedList.add(localLogInfo);
      }
      if (!localLinkedList.isEmpty())
        com.tencent.mm.ce.a.q(new ConsolePanel.9(this, localLinkedList));
      AppMethodBeat.o(11151);
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(11149);
    View localView;
    if (paramMotionEvent.getAction() == 0)
    {
      localView = ((Activity)getContext()).getCurrentFocus();
      if ((localView == null) || (!(localView instanceof EditText)))
        break label155;
      int[] arrayOfInt = new int[2];
      int[] tmp40_39 = arrayOfInt;
      tmp40_39[0] = 0;
      int[] tmp44_40 = tmp40_39;
      tmp44_40[1] = 0;
      tmp44_40;
      localView.getLocationInWindow(arrayOfInt);
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];
      k = localView.getHeight();
      int m = localView.getWidth();
      if ((paramMotionEvent.getX() > i) && (paramMotionEvent.getX() < m + i) && (paramMotionEvent.getY() > j) && (paramMotionEvent.getY() < k + j))
        break label155;
    }
    label155: for (int k = 1; ; k = 0)
    {
      if (k != 0)
        f.cX(localView);
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(11149);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.ConsolePanel
 * JD-Core Version:    0.6.2
 */