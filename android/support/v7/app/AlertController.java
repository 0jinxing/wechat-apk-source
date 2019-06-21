package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.b;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public final class AlertController
{
  ListAdapter Ei;
  CharSequence IT;
  CharSequence TA;
  Message TB;
  Drawable TC;
  NestedScrollView TD;
  int TE = 0;
  TextView TF;
  View TG;
  int TH = -1;
  int TI;
  int TJ;
  int TK;
  int TL;
  int TM;
  int TN;
  boolean TO;
  int TP = 0;
  final View.OnClickListener TQ = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if ((paramAnonymousView == AlertController.this.Tr) && (AlertController.this.Tt != null))
        paramAnonymousView = Message.obtain(AlertController.this.Tt);
      while (true)
      {
        if (paramAnonymousView != null)
          paramAnonymousView.sendToTarget();
        AlertController.this.mHandler.obtainMessage(1, AlertController.this.Th).sendToTarget();
        return;
        if ((paramAnonymousView == AlertController.this.Tv) && (AlertController.this.Tx != null))
          paramAnonymousView = Message.obtain(AlertController.this.Tx);
        else if ((paramAnonymousView == AlertController.this.Tz) && (AlertController.this.TB != null))
          paramAnonymousView = Message.obtain(AlertController.this.TB);
        else
          paramAnonymousView = null;
      }
    }
  };
  final i Th;
  final Window Ti;
  final int Tj;
  CharSequence Tk;
  int Tl;
  int Tm;
  int Tn;
  int To;
  int Tp;
  boolean Tq = false;
  public Button Tr;
  CharSequence Ts;
  Message Tt;
  Drawable Tu;
  public Button Tv;
  CharSequence Tw;
  Message Tx;
  Drawable Ty;
  public Button Tz;
  final Context mContext;
  Handler mHandler;
  ListView mListView;
  View mView;
  TextView ma;
  Drawable rP;
  ImageView sX;

  public AlertController(Context paramContext, i parami, Window paramWindow)
  {
    this.mContext = paramContext;
    this.Th = parami;
    this.Ti = paramWindow;
    this.mHandler = new b(parami);
    paramContext = paramContext.obtainStyledAttributes(null, a.a.AlertDialog, 2130772211, 0);
    this.TI = paramContext.getResourceId(0, 0);
    this.TJ = paramContext.getResourceId(1, 0);
    this.TK = paramContext.getResourceId(2, 0);
    this.TL = paramContext.getResourceId(3, 0);
    this.TM = paramContext.getResourceId(4, 0);
    this.TN = paramContext.getResourceId(5, 0);
    this.TO = paramContext.getBoolean(6, true);
    this.Tj = paramContext.getDimensionPixelSize(7, 0);
    paramContext.recycle();
    parami.fA();
  }

  static void a(View paramView1, View paramView2, View paramView3)
  {
    int i = 0;
    if (paramView2 != null)
    {
      if (paramView1.canScrollVertically(-1))
      {
        j = 0;
        paramView2.setVisibility(j);
      }
    }
    else if (paramView3 != null)
      if (!paramView1.canScrollVertically(1))
        break label51;
    label51: for (int j = i; ; j = 4)
    {
      paramView3.setVisibility(j);
      return;
      j = 4;
      break;
    }
  }

  static void a(Button paramButton)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    localLayoutParams.gravity = 1;
    localLayoutParams.weight = 0.5F;
    paramButton.setLayoutParams(localLayoutParams);
  }

  static boolean aQ(View paramView)
  {
    boolean bool = true;
    if (paramView.onCheckIsTextEditor());
    while (true)
    {
      return bool;
      if (!(paramView instanceof ViewGroup))
      {
        bool = false;
      }
      else
      {
        paramView = (ViewGroup)paramView;
        int i = paramView.getChildCount();
        while (true)
          if (i > 0)
          {
            int j = i - 1;
            i = j;
            if (aQ(paramView.getChildAt(j)))
              break;
          }
        bool = false;
      }
    }
  }

  static ViewGroup c(View paramView1, View paramView2)
  {
    if (paramView1 == null)
    {
      if (!(paramView2 instanceof ViewStub))
        break label76;
      paramView2 = ((ViewStub)paramView2).inflate();
    }
    label76: 
    while (true)
    {
      paramView1 = (ViewGroup)paramView2;
      return paramView1;
      if (paramView2 != null)
      {
        ViewParent localViewParent = paramView2.getParent();
        if ((localViewParent instanceof ViewGroup))
          ((ViewGroup)localViewParent).removeView(paramView2);
      }
      if ((paramView1 instanceof ViewStub))
        paramView1 = ((ViewStub)paramView1).inflate();
      while (true)
      {
        paramView1 = (ViewGroup)paramView1;
        break;
      }
    }
  }

  public final void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage, Drawable paramDrawable)
  {
    if (paramOnClickListener != null)
      paramMessage = this.mHandler.obtainMessage(paramInt, paramOnClickListener);
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Button does not exist");
    case -1:
      this.Ts = paramCharSequence;
      this.Tt = paramMessage;
      this.Tu = paramDrawable;
    case -2:
    case -3:
    }
    while (true)
    {
      return;
      this.Tw = paramCharSequence;
      this.Tx = paramMessage;
      this.Ty = paramDrawable;
      continue;
      this.TA = paramCharSequence;
      this.TB = paramMessage;
      this.TC = paramDrawable;
    }
  }

  public final void setIcon(int paramInt)
  {
    this.rP = null;
    this.TE = paramInt;
    if (this.sX != null)
    {
      if (paramInt == 0)
        break label41;
      this.sX.setVisibility(0);
      this.sX.setImageResource(this.TE);
    }
    while (true)
    {
      return;
      label41: this.sX.setVisibility(8);
    }
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    this.IT = paramCharSequence;
    if (this.TF != null)
      this.TF.setText(paramCharSequence);
  }

  public static class RecycleListView extends ListView
  {
    final int Ux;
    final int Uy;

    public RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.RecycleListView);
      this.Uy = paramContext.getDimensionPixelOffset(0, -1);
      this.Ux = paramContext.getDimensionPixelOffset(1, -1);
    }
  }

  public static final class a
  {
    public ListAdapter Ei;
    public CharSequence IT;
    public Cursor PI;
    public int TE = 0;
    public View TG;
    public int TH = -1;
    public int TU = 0;
    public CharSequence TV;
    public Drawable TW;
    public DialogInterface.OnClickListener TX;
    public CharSequence TY;
    public Drawable TZ;
    public CharSequence Tk;
    public int Tl;
    public int Tm;
    public int Tn;
    public int To;
    public int Tp;
    public boolean Tq = false;
    public DialogInterface.OnClickListener Ua;
    public CharSequence Ub;
    public Drawable Uc;
    public DialogInterface.OnClickListener Ud;
    public DialogInterface.OnCancelListener Ue;
    public DialogInterface.OnDismissListener Uf;
    public DialogInterface.OnKeyListener Ug;
    public CharSequence[] Uh;
    public DialogInterface.OnClickListener Ui;
    public boolean[] Uj;
    public boolean Uk;
    public boolean Ul;
    public DialogInterface.OnMultiChoiceClickListener Um;
    public String Un;
    public String Uo;
    public AdapterView.OnItemSelectedListener Up;
    public boolean Uq = true;
    public boolean mCancelable;
    public final Context mContext;
    public final LayoutInflater mInflater;
    public View mView;
    public Drawable rP;

    public a(Context paramContext)
    {
      this.mContext = paramContext;
      this.mCancelable = true;
      this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    }
  }

  static final class b extends Handler
  {
    private WeakReference<DialogInterface> Uw;

    public b(DialogInterface paramDialogInterface)
    {
      this.Uw = new WeakReference(paramDialogInterface);
    }

    public final void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      case 0:
      default:
      case -3:
      case -2:
      case -1:
      case 1:
      }
      while (true)
      {
        return;
        ((DialogInterface.OnClickListener)paramMessage.obj).onClick((DialogInterface)this.Uw.get(), paramMessage.what);
        continue;
        ((DialogInterface)paramMessage.obj).dismiss();
      }
    }
  }

  static final class c extends ArrayAdapter<CharSequence>
  {
    public c(Context paramContext, int paramInt, CharSequence[] paramArrayOfCharSequence)
    {
      super(paramInt, 16908308, paramArrayOfCharSequence);
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final boolean hasStableIds()
    {
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.AlertController
 * JD-Core Version:    0.6.2
 */