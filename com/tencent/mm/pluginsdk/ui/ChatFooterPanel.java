package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.mm.pluginsdk.ui.chat.f;

public abstract class ChatFooterPanel extends LinearLayout
{
  public static int vhh = 0;
  public static int vhi = 1;
  public static int vhj = 2;
  public static int vhk = 3;
  public static int vhl = 4;
  public static int vhm = 5;
  public static int vhn = 6;
  public static int vho = 7;
  public static int vhp = 8;
  public static int vhq = 9;
  public static int vhr = 10;
  public static int vhs = 11;
  protected int ubu;
  protected ChatFooterPanel.a vhf;
  protected f vhg;

  public ChatFooterPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public abstract void AC();

  public abstract void AD();

  public abstract void AE();

  public abstract void AF();

  public abstract void AG();

  public abstract void bf(boolean paramBoolean);

  public void destroy()
  {
  }

  public abstract void j(boolean paramBoolean1, boolean paramBoolean2);

  public abstract void onPause();

  public abstract void onResume();

  public abstract void refresh();

  public void setCallback(f paramf)
  {
    this.vhg = paramf;
  }

  public abstract void setDefaultEmojiByDetail(String paramString);

  public abstract void setEntranceScene(int paramInt);

  public void setFooterType(int paramInt)
  {
    this.ubu = paramInt;
  }

  public void setOnTextOperationListener(ChatFooterPanel.a parama)
  {
    this.vhf = parama;
  }

  public abstract void setPortHeightPx(int paramInt);

  public abstract void setSendButtonEnable(boolean paramBoolean);

  public abstract void setTalkerName(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ChatFooterPanel
 * JD-Core Version:    0.6.2
 */