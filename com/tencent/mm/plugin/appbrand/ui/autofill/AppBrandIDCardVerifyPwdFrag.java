package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.gc;
import com.tencent.mm.protocal.protobuf.gd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.a.c;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.lang.reflect.Method;
import java.util.LinkedList;

public class AppBrandIDCardVerifyPwdFrag extends MMFragment
{
  private LinearLayout eol;
  private MMFormVerifyCodeInputView gCi;
  private TextView hrg;
  AppBrandIDCardUI.a iJN;
  private View iJO;
  private Button iJR;
  private gd iKf;
  private gc iKn;
  private TextView iKo;
  private TextView ixA;
  private com.tencent.mm.ui.a mActionBarHelper;
  private MyKeyboardWindow mKeyboard;

  public void dealContentView(View paramView)
  {
    AppMethodBeat.i(133258);
    if ((this.iJN == null) || (this.iJN.aMI() == null))
    {
      ab.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "idCardUILogic or idCardUILogic.getIDCardShowInfo() is null, err");
      AppMethodBeat.o(133258);
    }
    while (true)
    {
      return;
      if ((this.iJN.aMI().vIf != null) && (this.iJN.aMI().vIf.size() > 0))
        break;
      ab.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "sms.get(0) is null, err, return");
      AppMethodBeat.o(133258);
    }
    this.eol = ((LinearLayout)paramView.findViewById(2131821210));
    this.hrg = ((TextView)paramView.findViewById(2131821211));
    this.ixA = ((TextView)paramView.findViewById(2131821212));
    this.iKo = ((TextView)paramView.findViewById(2131821213));
    this.iJR = ((Button)paramView.findViewById(2131821206));
    this.gCi = ((MMFormVerifyCodeInputView)paramView.findViewById(2131821214));
    this.mKeyboard = ((MyKeyboardWindow)paramView.findViewById(2131821215));
    this.iJO = v.hu(getContext()).inflate(2130968612, null);
    this.iJO.setBackgroundColor(getResources().getColor(2131690310));
    this.mActionBarHelper = new com.tencent.mm.ui.a(this.iJO);
    paramView = new LinearLayout.LayoutParams(-1, com.tencent.mm.plugin.appbrand.widget.a.de(getActivity()));
    this.eol.addView(this.iJO, 0, paramView);
    this.iKf = this.iJN.aMI();
    this.mActionBarHelper.setTitle(this.iKf.title);
    this.mActionBarHelper.b(new AppBrandIDCardVerifyPwdFrag.1(this));
    this.hrg.setText(this.iKf.desc);
    this.iKn = ((gc)this.iKf.vIf.get(0));
    this.ixA.setText(((gc)this.iKf.vIf.get(0)).vIe);
    if (this.iKf.vIf.size() > 1)
    {
      this.iKo.setVisibility(0);
      this.iKo.setOnClickListener(new AppBrandIDCardVerifyPwdFrag.2(this));
      label388: this.gCi.setVisibility(0);
      this.gCi.setSendSmsBtnClickListener(new AppBrandIDCardVerifyPwdFrag.3(this));
      this.gCi.addTextChangedListener(new AppBrandIDCardVerifyPwdFrag.4(this));
      paramView = this.gCi.getContentEditText();
      if (paramView != null)
      {
        if (Build.VERSION.SDK_INT < 21)
          break label574;
        paramView.setShowSoftInputOnFocus(false);
      }
      label451: if ((this.gCi.getText() == null) || (this.gCi.getText().toString().length() <= 0))
        break label768;
      this.iJR.setEnabled(true);
    }
    while (true)
    {
      while (true)
      {
        this.iJR.setVisibility(0);
        this.iJR.setOnClickListener(new AppBrandIDCardVerifyPwdFrag.5(this));
        this.mKeyboard.setXMode(0);
        this.mKeyboard.setInputEditText(this.gCi.getContentEditText());
        if (Build.VERSION.SDK_INT >= 14)
        {
          paramView = new c();
          this.mKeyboard.setAccessibilityDelegate(paramView);
        }
        AppMethodBeat.o(133258);
        break;
        this.iKo.setVisibility(8);
        break label388;
        try
        {
          label574: Method localMethod1 = EditText.class.getMethod("setShowSoftInputOnFocus", new Class[] { Boolean.TYPE });
          localMethod1.setAccessible(true);
          localMethod1.invoke(paramView, new Object[] { Boolean.FALSE });
          localMethod1.setAccessible(false);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          while (true)
          {
            ab.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "setNoSystemInputOnEditText, setShowSoftInputOnFocus no such method, api level = %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
            try
            {
              Method localMethod2 = EditText.class.getMethod("setSoftInputShownOnFocus", new Class[] { Boolean.TYPE });
              localMethod2.setAccessible(true);
              localMethod2.invoke(paramView, new Object[] { Boolean.FALSE });
              localMethod2.setAccessible(false);
            }
            catch (Exception localException)
            {
              ab.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "setNoSystemInputOnEditText, reflect method [setSoftInputShownOnFocus], exp = %s", new Object[] { bo.l(localException) });
            }
          }
          if ((paramView.getContext() == null) || (!(paramView.getContext() instanceof MMActivity)))
            break label451;
          ((MMActivity)paramView.getContext()).hideVKB(paramView);
        }
        catch (Exception paramView)
        {
          ab.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "setNoSystemInputOnEditText, reflect method [setShowSoftInputOnFocus], exp = %s", new Object[] { bo.l(paramView) });
        }
      }
      break label451;
      label768: this.iJR.setEnabled(false);
    }
  }

  public int getLayoutId()
  {
    return 2130968688;
  }

  public boolean noActionBar()
  {
    return true;
  }

  public void onResume()
  {
    AppMethodBeat.i(133259);
    super.onResume();
    if (isSupportNavigationSwipeBack())
    {
      getContentView().setVisibility(0);
      getSwipeBackLayout().setEnableGesture(true);
    }
    AppMethodBeat.o(133259);
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(133260);
    if (this.iJN != null)
    {
      this.iJN.onSwipeBack();
      getContentView().setVisibility(8);
      if (isSupportNavigationSwipeBack())
        getSwipeBackLayout().setEnableGesture(false);
    }
    AppMethodBeat.o(133260);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag
 * JD-Core Version:    0.6.2
 */