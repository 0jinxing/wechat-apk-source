package com.tencent.mm.plugin.story.ui;

import a.f.a.m;
import a.f.b.j;
import a.f.b.k;
import a.l;
import a.y;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.b.a;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/StoryCommentsUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "commentAdapter", "Lcom/tencent/mm/plugin/story/ui/StoryCommentsUI$CommentUnreadAdapter;", "commentRecycler", "Landroid/support/v7/widget/RecyclerView;", "getLayoutId", "", "onCommentsLoaded", "", "comments", "", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "CommentUnreadAdapter", "plugin-story_release"})
public final class StoryCommentsUI extends MMActivity
{
  private RecyclerView seK;
  private StoryCommentsUI.a seL;

  public final int getLayoutId()
  {
    return 2130970873;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(110031);
    super.onCreate(paramBundle);
    paramBundle = findViewById(2131828077);
    j.o(paramBundle, "findViewById(R.id.story_comment_recycler)");
    this.seK = ((RecyclerView)paramBundle);
    paramBundle = this.seK;
    if (paramBundle == null)
      j.avw("commentRecycler");
    paramBundle.setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    this.seL = new StoryCommentsUI.a(this);
    paramBundle = this.seK;
    if (paramBundle == null)
      j.avw("commentRecycler");
    Object localObject = this.seL;
    if (localObject == null)
      j.avw("commentAdapter");
    paramBundle.setAdapter((RecyclerView.a)localObject);
    paramBundle = this.seL;
    if (paramBundle == null)
      j.avw("commentAdapter");
    paramBundle.seN = ((m)b.seU);
    localObject = new ArrayList();
    paramBundle = this.seL;
    if (paramBundle == null)
      j.avw("commentAdapter");
    localObject = (List)localObject;
    j.p(localObject, "storyComments");
    paramBundle.seM.clear();
    paramBundle.seM.addAll((Collection)localObject);
    paramBundle.notifyDataSetChanged();
    AppMethodBeat.o(110031);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "position", "", "item", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "invoke"})
  static final class b extends k
    implements m<Integer, a, y>
  {
    public static final b seU;

    static
    {
      AppMethodBeat.i(110030);
      seU = new b();
      AppMethodBeat.o(110030);
    }

    b()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryCommentsUI
 * JD-Core Version:    0.6.2
 */