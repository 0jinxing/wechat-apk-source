package com.tencent.mm.emoji.debug;

import a.a.j;
import a.f.a.a;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.z;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/debug/EmojiDebugUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "itemList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/emoji/debug/EmojiDebugUI$AbsItem;", "recycler", "Landroid/support/v7/widget/RecyclerView;", "getConfig", "T", "key", "Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;", "defVal", "(Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;Ljava/lang/Object;)Ljava/lang/Object;", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setConfig", "value", "(Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;Ljava/lang/Object;)V", "AbsItem", "ClickItem", "ConfigItem", "DebugAdapter", "DebugViewHolder", "plugin-emojisdk_release"})
public final class EmojiDebugUI extends MMActivity
{
  private final LinkedList<EmojiDebugUI.a> ewZ;
  private RecyclerView exa;

  public EmojiDebugUI()
  {
    AppMethodBeat.i(63131);
    this.ewZ = new LinkedList();
    AppMethodBeat.o(63131);
  }

  public final int getLayoutId()
  {
    return 2130969335;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(63130);
    super.onCreate(paramBundle);
    setBackBtn((MenuItem.OnMenuItemClickListener)new EmojiDebugUI.f(this));
    this.exa = ((RecyclerView)findViewById(2131823454));
    paramBundle = this.exa;
    if (paramBundle != null)
      paramBundle.setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    paramBundle = this.exa;
    if (paramBundle != null)
      paramBundle.setAdapter((RecyclerView.a)new EmojiDebugUI.d(this));
    paramBundle = this.exa;
    if (paramBundle != null)
      paramBundle.b((RecyclerView.h)new z((Context)this));
    paramBundle = this.exa;
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getAdapter();
      if (paramBundle != null)
        paramBundle.notifyDataSetChanged();
    }
    this.ewZ.add(new EmojiDebugUI.c(this, "预览裁剪方式", ac.a.xWU, j.listOf(new String[] { "GPU", "CPU" }), j.listOf(new Integer[] { Integer.valueOf(1), Integer.valueOf(0) })));
    this.ewZ.add(new EmojiDebugUI.b(this, "临时屏蔽小尾巴", "", (a)new EmojiDebugUI.g(this)));
    this.ewZ.add(new EmojiDebugUI.b(this, "重置自拍更新红点", "", (a)new EmojiDebugUI.h(this)));
    this.ewZ.add(new EmojiDebugUI.b(this, "重置春节红点", "", (a)new EmojiDebugUI.i(this)));
    AppMethodBeat.o(63130);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "whichButton", "", "resultId", "onClick"})
  static final class c$a
    implements h.d
  {
    c$a(EmojiDebugUI.c paramc)
    {
    }

    public final void bV(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(63117);
      EmojiDebugUI.b(this.exg.exd, this.exg.exf.get(paramInt2));
      Object localObject = EmojiDebugUI.a(this.exg.exb);
      if (localObject != null)
      {
        localObject = ((RecyclerView)localObject).getAdapter();
        if (localObject != null)
        {
          ((RecyclerView.a)localObject).notifyDataSetChanged();
          AppMethodBeat.o(63117);
        }
      }
      while (true)
      {
        return;
        AppMethodBeat.o(63117);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.debug.EmojiDebugUI
 * JD-Core Version:    0.6.2
 */