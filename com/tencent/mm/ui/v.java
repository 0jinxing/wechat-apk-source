package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ca.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class v
{
  public static final int[] ynp = { 16843087, 16843088, 16843379 };
  public static final int[] ynq = { 16843379 };

  public static LayoutInflater a(LayoutInflater paramLayoutInflater)
  {
    AppMethodBeat.i(106107);
    a.dm(paramLayoutInflater.getContext());
    LayoutInflater localLayoutInflater = paramLayoutInflater.cloneInContext(paramLayoutInflater.getContext());
    paramLayoutInflater = new a((byte)0);
    paramLayoutInflater.layoutInflater = localLayoutInflater;
    localLayoutInflater.setFactory(paramLayoutInflater);
    AppMethodBeat.o(106107);
    return localLayoutInflater;
  }

  public static LayoutInflater hu(Context paramContext)
  {
    AppMethodBeat.i(106108);
    a.dm(paramContext);
    paramContext = LayoutInflater.from(paramContext).cloneInContext(paramContext);
    a locala = new a((byte)0);
    locala.layoutInflater = paramContext;
    paramContext.setFactory(locala);
    AppMethodBeat.o(106108);
    return paramContext;
  }

  static final class a
    implements LayoutInflater.Factory
  {
    LayoutInflater layoutInflater;

    private View createView(String paramString1, String paramString2, AttributeSet paramAttributeSet)
    {
      AppMethodBeat.i(106106);
      Object localObject = null;
      try
      {
        paramString1 = this.layoutInflater.createView(paramString1, paramString2, paramAttributeSet);
        AppMethodBeat.o(106106);
        return paramString1;
      }
      catch (ClassNotFoundException paramString1)
      {
        while (true)
          paramString1 = localObject;
      }
      catch (InflateException paramString1)
      {
        while (true)
          paramString1 = localObject;
      }
    }

    public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
    {
      Object localObject1 = null;
      Object localObject2 = null;
      AppMethodBeat.i(106105);
      Object localObject3 = localObject2;
      Object localObject4 = localObject1;
      try
      {
        if (paramString.indexOf(".") == -1)
        {
          localObject3 = localObject2;
          localObject4 = localObject1;
          if (!paramString.equals("WebView"))
            break label2534;
          localObject3 = localObject2;
          localObject4 = localObject1;
          localObject5 = createView(paramString, "android.webkit.", paramAttributeSet);
          localObject3 = localObject5;
          if (localObject5 == null)
          {
            localObject3 = localObject2;
            localObject4 = localObject1;
            localObject5 = createView(paramString, "android.widget.", paramAttributeSet);
            localObject3 = localObject5;
          }
          if (localObject3 != null)
            break label2527;
          localObject3 = localObject2;
          localObject4 = localObject1;
          localObject5 = createView(paramString, "android.view.", paramAttributeSet);
          localObject3 = localObject5;
          localObject4 = localObject5;
          if ((localObject5 instanceof ViewStub))
          {
            localObject3 = localObject5;
            localObject4 = localObject5;
            if (Build.VERSION.SDK_INT >= 21)
            {
              localObject3 = localObject5;
              localObject4 = localObject5;
              ((ViewStub)localObject5).setLayoutInflater(this.layoutInflater);
            }
          }
          if (localObject5 == null)
            break label2494;
          localObject3 = localObject5;
          localObject4 = localObject5;
          if (!paramString.equals("TextView"))
          {
            localObject3 = localObject5;
            localObject4 = localObject5;
            if (!paramString.equals("Button"))
            {
              localObject3 = localObject5;
              localObject4 = localObject5;
              if (!paramString.equals("EditText"))
              {
                localObject3 = localObject5;
                localObject4 = localObject5;
                if (!paramString.equals("CheckBox"))
                {
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  if (!paramString.equals("ImageView"))
                  {
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    if (!paramString.equals("CheckedTextView"))
                    {
                      localObject3 = localObject5;
                      localObject4 = localObject5;
                      if (!paramString.equals("com.tencent.mm.ui.widget.MMTextView"))
                      {
                        localObject3 = localObject5;
                        localObject4 = localObject5;
                        if (!paramString.equals("com.tencent.mm.ui.widget.MMEditText"))
                        {
                          localObject3 = localObject5;
                          localObject4 = localObject5;
                          if (!paramString.equals("com.tencent.mm.ui.widget.MMNeat7extView"))
                          {
                            localObject3 = localObject5;
                            localObject4 = localObject5;
                            if (!paramString.equals("com.tencent.mm.ui.base.MMClearEditText"))
                            {
                              localObject3 = localObject5;
                              localObject4 = localObject5;
                              if (!paramString.equals("com.tencent.mm.ui.widget.edittext.PasterEditText"))
                              {
                                localObject3 = localObject5;
                                localObject4 = localObject5;
                                if (!paramString.equals("com.tenpay.android.wechat.TenpaySecureEditText"))
                                {
                                  localObject3 = localObject5;
                                  localObject4 = localObject5;
                                  if (!paramString.equals("com.tencent.mm.ui.base.MMVisiblePasswordEditText"))
                                  {
                                    localObject3 = localObject5;
                                    localObject4 = localObject5;
                                    if (!paramString.equals("com.tencent.mm.ui.tools.MMTruncTextView"))
                                    {
                                      localObject3 = localObject5;
                                      localObject4 = localObject5;
                                      if (!paramString.equals("com.tencent.mm.plugin.brandservice.ui.base.CatalogView"))
                                      {
                                        localObject3 = localObject5;
                                        localObject4 = localObject5;
                                        if (!paramString.equals("com.tencent.mm.ui.tools.CustomFitTextView"))
                                        {
                                          localObject3 = localObject5;
                                          localObject4 = localObject5;
                                          if (!paramString.equals("com.tencent.mm.ui.tools.ActionBarSearchView$ActionBarEditText"))
                                          {
                                            localObject3 = localObject5;
                                            localObject4 = localObject5;
                                            if (!paramString.equals("com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView"))
                                            {
                                              localObject3 = localObject5;
                                              localObject4 = localObject5;
                                              if (!paramString.equals("com.tencent.mm.plugin.game.ui.GameDropdownView"))
                                              {
                                                localObject3 = localObject5;
                                                localObject4 = localObject5;
                                                if (!paramString.equals("com.tencent.mm.ui.ScrollAlwaysTextView"))
                                                {
                                                  localObject3 = localObject5;
                                                  localObject4 = localObject5;
                                                  if (!paramString.equals("com.tencent.mm.ui.base.MMAutoSizeTextView"))
                                                  {
                                                    localObject3 = localObject5;
                                                    localObject4 = localObject5;
                                                    if (!paramString.equals("com.tencent.mm.ui.widget.textview.MMAutoAdjustTextView"))
                                                    {
                                                      localObject3 = localObject5;
                                                      localObject4 = localObject5;
                                                      if (!paramString.equals("com.tencent.mm.plugin.sns.ui.AsyncTextView"))
                                                      {
                                                        localObject3 = localObject5;
                                                        localObject4 = localObject5;
                                                        if (!paramString.equals("com.tencent.mm.plugin.sns.ui.SnsTextView"))
                                                        {
                                                          localObject3 = localObject5;
                                                          localObject4 = localObject5;
                                                          if (!paramString.equals("com.tencent.mm.plugin.sns.ui.MaskTextView"))
                                                          {
                                                            localObject3 = localObject5;
                                                            localObject4 = localObject5;
                                                            if (!paramString.equals("com.tencent.mm.plugin.sns.ui.SnsEditText"))
                                                            {
                                                              localObject3 = localObject5;
                                                              localObject4 = localObject5;
                                                              if (!paramString.equals("com.tencent.mm.kiss.widget.textview.PLSysTextView"))
                                                              {
                                                                localObject3 = localObject5;
                                                                localObject4 = localObject5;
                                                                if (!paramString.equals("com.tencent.mm.ui.base.EllipsizeTextView"))
                                                                {
                                                                  localObject3 = localObject5;
                                                                  localObject2 = localObject5;
                                                                  localObject4 = localObject5;
                                                                  if (!paramString.equals("com.tencent.mm.wallet_core.ui.WalletTextView"))
                                                                    break label1118;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          localObject3 = localObject5;
          localObject4 = localObject5;
          f = a.dm(paramContext);
          if ((f != 1.875F) && (f != 2.025F))
            break label2524;
          localObject3 = localObject5;
          localObject4 = localObject5;
          if (paramString.equals("com.tencent.mm.ui.widget.MMTextView"))
            break label2524;
          localObject3 = localObject5;
          localObject4 = localObject5;
          if (paramString.equals("com.tencent.mm.plugin.sns.ui.AsyncTextView"))
            break label2524;
          localObject3 = localObject5;
          localObject4 = localObject5;
          if (paramString.equals("com.tencent.mm.plugin.sns.ui.SnsTextView"))
            break label2524;
          localObject3 = localObject5;
          localObject4 = localObject5;
          if (paramString.equals("com.tencent.mm.plugin.sns.ui.MaskTextView"))
            break label2524;
          localObject3 = localObject5;
          localObject4 = localObject5;
          if (paramString.equals("com.tencent.mm.ui.widget.MMNeat7extView"))
            break label2524;
          f = 1.625F;
          localObject3 = localObject5;
          localObject4 = localObject5;
          if (!paramString.equals("TextView"))
          {
            localObject3 = localObject5;
            localObject4 = localObject5;
            if (!paramString.equals("com.tencent.mm.ui.widget.MMTextView"))
            {
              localObject3 = localObject5;
              localObject4 = localObject5;
              if (!paramString.equals("com.tencent.mm.wallet_core.ui.WalletTextView"))
                break label1190;
            }
          }
          localObject3 = localObject5;
          localObject4 = localObject5;
          localObject1 = (TextView)localObject5;
          localObject3 = localObject5;
          localObject4 = localObject5;
          ((TextView)localObject1).setTextSize(1, f * ((TextView)localObject1).getTextSize() / a.getDensity(((TextView)localObject1).getContext()));
          localObject3 = localObject5;
          localObject4 = localObject5;
          paramContext.getAssets();
          localObject3 = localObject5;
          localObject4 = localObject5;
          f.dmU();
          localObject3 = localObject5;
          localObject2 = localObject5;
          localObject4 = localObject5;
          if (!f.dmV())
            break label1118;
          localObject3 = localObject5;
          localObject4 = localObject5;
          paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, v.ynp);
          i = 0;
          label951: localObject3 = localObject5;
          localObject4 = localObject5;
          if (i >= v.ynp.length)
            break label1171;
          localObject3 = localObject5;
          localObject4 = localObject5;
          j = paramAttributeSet.getResourceId(i, 0);
          if (j != 0)
          {
            localObject3 = localObject5;
            localObject4 = localObject5;
            if (v.ynp[i] != 16843379)
              break label1057;
            localObject3 = localObject5;
            localObject4 = localObject5;
            ((TextView)localObject1).setContentDescription(paramContext.getString(j));
          }
        }
        while (true)
        {
          i++;
          break label951;
          localObject3 = localObject2;
          localObject4 = localObject1;
          localObject5 = this.layoutInflater.createView(paramString, null, paramAttributeSet);
          break;
          label1057: localObject3 = localObject5;
          localObject4 = localObject5;
          if (v.ynp[i] != 16843088)
            break label1126;
          localObject3 = localObject5;
          localObject4 = localObject5;
          ((TextView)localObject1).setHint(paramContext.getString(j));
        }
      }
      catch (ClassNotFoundException paramContext)
      {
        while (true)
        {
          ab.w("MicroMsg.MMLayoutInflater", "[cpan] class not found. name:%s. Use default Inflate.", new Object[] { paramString });
          localObject2 = localObject3;
          AppMethodBeat.o(106105);
          return localObject2;
          localObject3 = localObject5;
          localObject4 = localObject5;
          ((TextView)localObject1).setText(paramContext.getString(j));
        }
      }
      catch (InflateException paramContext)
      {
        while (true)
        {
          Object localObject5;
          float f;
          int i;
          int j;
          label1118: label1126: ab.w("MicroMsg.MMLayoutInflater", "[cpan] Inflate failed. name:%s. Use default Inflate.", new Object[] { paramString });
          localObject2 = localObject4;
          continue;
          label1171: localObject3 = localObject5;
          localObject4 = localObject5;
          paramAttributeSet.recycle();
          localObject2 = localObject5;
          continue;
          label1190: localObject3 = localObject5;
          localObject4 = localObject5;
          if (paramString.equals("Button"))
          {
            localObject3 = localObject5;
            localObject4 = localObject5;
            localObject1 = (Button)localObject5;
            localObject3 = localObject5;
            localObject4 = localObject5;
            ((Button)localObject1).setTextSize(1, f * ((Button)localObject1).getTextSize() / a.getDensity(((Button)localObject1).getContext()));
            localObject3 = localObject5;
            localObject4 = localObject5;
            paramContext.getAssets();
            localObject3 = localObject5;
            localObject4 = localObject5;
            f.dmU();
            localObject3 = localObject5;
            localObject2 = localObject5;
            localObject4 = localObject5;
            if (f.dmV())
            {
              localObject3 = localObject5;
              localObject4 = localObject5;
              paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, v.ynp);
              i = 0;
              localObject3 = localObject5;
              localObject4 = localObject5;
              if (i < v.ynp.length)
              {
                localObject3 = localObject5;
                localObject4 = localObject5;
                j = paramAttributeSet.getResourceId(i, 0);
                if (j != 0)
                {
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  if (v.ynp[i] != 16843379)
                    break label1399;
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  ((Button)localObject1).setContentDescription(paramContext.getString(j));
                }
                while (true)
                {
                  i++;
                  break;
                  label1399: localObject3 = localObject5;
                  localObject4 = localObject5;
                  if (v.ynp[i] == 16843088)
                  {
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    ((Button)localObject1).setHint(paramContext.getString(j));
                  }
                  else
                  {
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    ((Button)localObject1).setText(paramContext.getString(j));
                  }
                }
              }
              localObject3 = localObject5;
              localObject4 = localObject5;
              paramAttributeSet.recycle();
              localObject2 = localObject5;
            }
          }
          else
          {
            localObject3 = localObject5;
            localObject4 = localObject5;
            if (!paramString.equals("EditText"))
            {
              localObject3 = localObject5;
              localObject4 = localObject5;
              if (!paramString.equals("com.tencent.mm.ui.widget.MMEditText"))
              {
                localObject3 = localObject5;
                localObject4 = localObject5;
                if (!paramString.equals("com.tencent.mm.ui.base.MMClearEditText"))
                {
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  if (!paramString.equals("com.tencent.mm.ui.widget.edittext.PasterEditText"))
                  {
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    if (!paramString.equals("com.tencent.mm.ui.tools.ActionBarSearchView$ActionBarEditText"))
                    {
                      localObject3 = localObject5;
                      localObject4 = localObject5;
                      if (!paramString.equals("com.tenpay.android.wechat.TenpaySecureEditText"))
                      {
                        localObject3 = localObject5;
                        localObject4 = localObject5;
                        if (!paramString.equals("com.tencent.mm.ui.base.MMVisiblePasswordEditText"))
                        {
                          localObject3 = localObject5;
                          localObject4 = localObject5;
                          if (!paramString.equals("com.tencent.mm.plugin.sns.ui.SnsEditText"))
                            break label1891;
                        }
                      }
                    }
                  }
                }
              }
            }
            localObject3 = localObject5;
            localObject4 = localObject5;
            localObject1 = (EditText)localObject5;
            localObject3 = localObject5;
            localObject4 = localObject5;
            ((EditText)localObject1).setTextSize(1, f * ((EditText)localObject1).getTextSize() / a.getDensity(((EditText)localObject1).getContext()));
            localObject3 = localObject5;
            localObject4 = localObject5;
            paramContext.getAssets();
            localObject3 = localObject5;
            localObject4 = localObject5;
            f.dmU();
            localObject3 = localObject5;
            localObject2 = localObject5;
            localObject4 = localObject5;
            if (f.dmV())
            {
              localObject3 = localObject5;
              localObject4 = localObject5;
              paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, v.ynp);
              i = 0;
              localObject3 = localObject5;
              localObject4 = localObject5;
              if (i < v.ynp.length)
              {
                localObject3 = localObject5;
                localObject4 = localObject5;
                j = paramAttributeSet.getResourceId(i, 0);
                if (j != 0)
                {
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  if (v.ynp[i] != 16843379)
                    break label1809;
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  ((EditText)localObject1).setContentDescription(paramContext.getString(j));
                }
                while (true)
                {
                  i++;
                  break;
                  label1809: localObject3 = localObject5;
                  localObject4 = localObject5;
                  if (v.ynp[i] == 16843088)
                  {
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    ((EditText)localObject1).setHint(paramContext.getString(j));
                  }
                  else
                  {
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    ((EditText)localObject1).setText(paramContext.getString(j));
                  }
                }
              }
              localObject3 = localObject5;
              localObject4 = localObject5;
              paramAttributeSet.recycle();
              localObject2 = localObject5;
              continue;
              label1891: localObject3 = localObject5;
              localObject4 = localObject5;
              if (paramString.equals("CheckBox"))
              {
                localObject3 = localObject5;
                localObject4 = localObject5;
                localObject1 = (CheckBox)localObject5;
                localObject3 = localObject5;
                localObject4 = localObject5;
                ((CheckBox)localObject1).setTextSize(1, f * ((CheckBox)localObject1).getTextSize() / a.getDensity(((CheckBox)localObject1).getContext()));
                localObject3 = localObject5;
                localObject4 = localObject5;
                paramContext.getAssets();
                localObject3 = localObject5;
                localObject4 = localObject5;
                f.dmU();
                localObject3 = localObject5;
                localObject2 = localObject5;
                localObject4 = localObject5;
                if (f.dmV())
                {
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, v.ynp);
                  i = 0;
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  if (i < v.ynp.length)
                  {
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    j = paramAttributeSet.getResourceId(i, 0);
                    if (j != 0)
                    {
                      localObject3 = localObject5;
                      localObject4 = localObject5;
                      if (v.ynp[i] != 16843379)
                        break label2100;
                      localObject3 = localObject5;
                      localObject4 = localObject5;
                      ((CheckBox)localObject1).setContentDescription(paramContext.getString(j));
                    }
                    while (true)
                    {
                      i++;
                      break;
                      label2100: localObject3 = localObject5;
                      localObject4 = localObject5;
                      if (v.ynp[i] == 16843088)
                      {
                        localObject3 = localObject5;
                        localObject4 = localObject5;
                        ((CheckBox)localObject1).setHint(paramContext.getString(j));
                      }
                      else
                      {
                        localObject3 = localObject5;
                        localObject4 = localObject5;
                        ((CheckBox)localObject1).setText(paramContext.getString(j));
                      }
                    }
                  }
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  paramAttributeSet.recycle();
                  localObject2 = localObject5;
                }
              }
              else
              {
                localObject3 = localObject5;
                localObject4 = localObject5;
                if (paramString.equals("ImageView"))
                {
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  localObject1 = (ImageView)localObject5;
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  paramContext.getAssets();
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  f.dmU();
                  localObject3 = localObject5;
                  localObject2 = localObject5;
                  localObject4 = localObject5;
                  if (f.dmV())
                  {
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, v.ynq);
                    for (i = 0; ; i++)
                    {
                      localObject3 = localObject5;
                      localObject4 = localObject5;
                      if (i >= v.ynq.length)
                        break;
                      localObject3 = localObject5;
                      localObject4 = localObject5;
                      j = paramAttributeSet.getResourceId(i, 0);
                      if (j != 0)
                      {
                        localObject3 = localObject5;
                        localObject4 = localObject5;
                        if (v.ynq[i] == 16843379)
                        {
                          localObject3 = localObject5;
                          localObject4 = localObject5;
                          ((ImageView)localObject1).setContentDescription(paramContext.getString(j));
                        }
                      }
                    }
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    paramAttributeSet.recycle();
                    localObject2 = localObject5;
                  }
                }
                else
                {
                  localObject3 = localObject5;
                  localObject4 = localObject5;
                  if (paramString.equals("com.tencent.mm.ui.widget.MMNeat7extView"))
                  {
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    paramContext = (MMNeat7extView)localObject5;
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    paramContext.setTextSize(1, f * paramContext.getTextSize() / a.getDensity(paramContext.getContext()));
                    localObject2 = localObject5;
                  }
                  else
                  {
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    paramContext = (TextView)localObject5;
                    localObject3 = localObject5;
                    localObject4 = localObject5;
                    paramContext.setTextSize(1, f * paramContext.getTextSize() / a.getDensity(paramContext.getContext()));
                    localObject2 = localObject5;
                    continue;
                    label2494: localObject3 = localObject5;
                    localObject4 = localObject5;
                    ab.w("MicroMsg.MMLayoutInflater", "Inflate view, ClassNotFound ".concat(String.valueOf(paramString)));
                    localObject2 = localObject5;
                    continue;
                    label2524: continue;
                    label2527: localObject5 = localObject3;
                    continue;
                    label2534: localObject5 = null;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.v
 * JD-Core Version:    0.6.2
 */