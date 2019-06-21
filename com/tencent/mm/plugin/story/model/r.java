package com.tencent.mm.plugin.story.model;

import a.f.b.u.c;
import a.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.luckymoney.particles.c;
import com.tencent.mm.plugin.luckymoney.particles.d;
import com.tencent.mm.plugin.story.api.AbsStoryGallery;
import com.tencent.mm.plugin.story.api.AbsStoryMuteView;
import com.tencent.mm.plugin.story.api.i;
import com.tencent.mm.plugin.story.api.m.a;
import com.tencent.mm.plugin.story.ui.album.StoryAlbumUI;
import com.tencent.mm.plugin.story.ui.view.StoryMuteView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.bs;
import com.tencent.mm.ui.MMFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryUIFactory;", "Lcom/tencent/mm/plugin/story/api/IStoryUIFactory;", "()V", "CONFETTI_WIDTH_DP", "", "TAG", "", "VIVO_COMPATIBLE_LIST", "", "confettiManagers", "Ljava/util/HashMap;", "Landroid/view/View;", "Lcom/tencent/mm/plugin/luckymoney/particles/ConfettiManager;", "Lkotlin/collections/HashMap;", "mRunningConfetti", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "printLog", "", "unreadConfettiGenerator", "Lcom/tencent/mm/plugin/luckymoney/particles/ConfettiGenerator;", "bindUnreadBubbleConfetti", "", "parentView", "Landroid/view/ViewGroup;", "anchor", "genCompatibleBubble", "Landroid/graphics/Bitmap;", "getStoryGallery", "Lcom/tencent/mm/plugin/story/api/AbsStoryGallery;", "context", "Landroid/content/Context;", "type", "Lcom/tencent/mm/plugin/story/api/IStoryUIFactory$GalleryType;", "chatRoom", "getStoryHintDrawable", "Landroid/graphics/drawable/Drawable;", "highLight", "getStoryHintProxy", "Lcom/tencent/mm/plugin/story/api/IStoryHintProxy;", "getStoryMuteView", "Lcom/tencent/mm/plugin/story/api/AbsStoryMuteView;", "instantiateAlbumFragment", "Lcom/tencent/mm/ui/MMFragment;", "bundle", "Landroid/os/Bundle;", "isInCompatibleList", "lazyInit", "startUnreadBubbleConfetti", "stopUnreadBubbleConfetti", "unbindUnreadBubbleConfetti", "plugin-story_release"})
public final class r
  implements com.tencent.mm.plugin.story.api.m
{
  private static final String TAG = "MicroMsg.StoryUIFactory";
  private static com.tencent.mm.plugin.luckymoney.particles.b rTM;
  private static HashMap<View, c> rTN;
  private static ArrayList<c> rTO;
  private static int rTP;
  private static boolean rTQ;
  private static final List<String> rTR;
  public static final r rTS;

  static
  {
    AppMethodBeat.i(109164);
    rTS = new r();
    TAG = "MicroMsg.StoryUIFactory";
    rTN = new HashMap();
    rTO = new ArrayList();
    rTQ = true;
    rTR = a.a.j.listOf(new String[] { "y83a", "v1732a", " y83", "v1732t" });
    AppMethodBeat.o(109164);
  }

  public final AbsStoryGallery a(Context paramContext, m.a parama, String paramString)
  {
    AppMethodBeat.i(109156);
    a.f.b.j.p(paramContext, "context");
    a.f.b.j.p(parama, "type");
    paramContext = new com.tencent.mm.plugin.story.ui.view.gallery.l(paramContext, parama);
    paramContext.setChatRoom(paramString);
    paramContext = (AbsStoryGallery)paramContext;
    AppMethodBeat.o(109156);
    return paramContext;
  }

  public final void d(ViewGroup paramViewGroup, View paramView)
  {
    AppMethodBeat.i(109160);
    a.f.b.j.p(paramView, "anchor");
    u.c localc;
    Object localObject2;
    int i;
    if (rTM == null)
    {
      rTP = a.fromDPToPix(ah.getContext(), 8);
      localc = new u.c();
      if (rTQ)
      {
        ab.i(TAG, "isInCompatibleList " + Build.BRAND + "  config " + bs.dut() + ' ');
        rTQ = false;
      }
      Object localObject1 = (Iterable)rTR;
      localObject2 = (Collection)new ArrayList();
      localObject1 = ((Iterable)localObject1).iterator();
      label220: label224: 
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject3 = ((Iterator)localObject1).next();
        String str1 = (String)localObject3;
        String str2 = Build.MODEL;
        a.f.b.j.o(str2, "Build.MODEL");
        if (!a.k.m.a((CharSequence)str2, (CharSequence)str1, true))
        {
          str2 = Build.DEVICE;
          a.f.b.j.o(str2, "Build.DEVICE");
          if (!a.k.m.a((CharSequence)str2, (CharSequence)str1, true))
            break label220;
        }
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label224;
          ((Collection)localObject2).add(localObject3);
          break;
        }
      }
      localObject2 = (List)localObject2;
      if ((!a.f.b.j.j(Build.BRAND, "vivo")) || (((List)localObject2).isEmpty()) || (Build.VERSION.SDK_INT != 27))
        break label484;
      i = 1;
      if (i == 0)
        break label490;
      localObject2 = ah.getContext();
      a.f.b.j.o(localObject2, "MMApplicationContext.getContext()");
      localObject2 = BitmapFactory.decodeResource(((Context)localObject2).getResources(), 2130840342);
      a.f.b.j.o(localObject2, "BitmapFactory.decodeReso…ble.story_comment_bubble)");
    }
    while (true)
    {
      localc.AVE = localObject2;
      rTM = (com.tencent.mm.plugin.luckymoney.particles.b)new r.a(localc);
      if (!rTN.containsKey(paramView))
      {
        i = paramView.getLeft() + paramView.getWidth() / 2 - rTP / 2;
        int j = paramView.getTop();
        ab.d(TAG, "bindUnreadBubbleConfetti containerMiddleX=" + i + " containerMiddleY=" + j);
        localObject2 = new d(i, j);
        localObject2 = new c(ah.getContext(), rTM, (d)localObject2, paramViewGroup).bLG().aF(8.0F).R(0.0F, 15.0F).S(-60.0F, 10.0F).bLK();
        paramViewGroup = (Map)rTN;
        a.f.b.j.o(localObject2, "manager");
        paramViewGroup.put(paramView, localObject2);
      }
      AppMethodBeat.o(109160);
      return;
      label484: i = 0;
      break;
      label490: localObject2 = ah.getContext();
      a.f.b.j.o(localObject2, "MMApplicationContext.getContext()");
      localObject2 = BitmapFactory.decodeResource(((Context)localObject2).getResources(), 2130840342);
      i = rTP;
      localObject2 = Bitmap.createScaledBitmap((Bitmap)localObject2, i, i, true);
    }
  }

  public final AbsStoryMuteView eV(Context paramContext)
  {
    AppMethodBeat.i(109157);
    AbsStoryMuteView localAbsStoryMuteView = null;
    if (paramContext != null)
      localAbsStoryMuteView = (AbsStoryMuteView)new StoryMuteView(paramContext);
    AppMethodBeat.o(109157);
    return localAbsStoryMuteView;
  }

  public final i eW(Context paramContext)
  {
    AppMethodBeat.i(109155);
    a.f.b.j.p(paramContext, "context");
    paramContext = (i)new com.tencent.mm.plugin.story.proxy.b(paramContext);
    AppMethodBeat.o(109155);
    return paramContext;
  }

  public final void ee(View paramView)
  {
    AppMethodBeat.i(109161);
    a.f.b.j.p(paramView, "anchor");
    if (rTN.containsKey(paramView))
      rTN.remove(paramView);
    AppMethodBeat.o(109161);
  }

  public final void ef(View paramView)
  {
    AppMethodBeat.i(109162);
    a.f.b.j.p(paramView, "anchor");
    ab.d(TAG, "startUnreadBubbleConfetti mRunningConfetti=" + rTO);
    paramView = (c)rTN.get(paramView);
    if (paramView != null)
    {
      if (!rTO.contains(paramView))
      {
        ab.d(TAG, "startUnreadBubbleConfetti");
        paramView.bLL();
        rTO.add(paramView);
      }
      AppMethodBeat.o(109162);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109162);
    }
  }

  public final void eg(View paramView)
  {
    AppMethodBeat.i(109163);
    a.f.b.j.p(paramView, "anchor");
    ab.d(TAG, "stopUnreadBubbleConfetti mRunningConfetti=" + rTO);
    paramView = (c)rTN.get(paramView);
    if (paramView != null)
    {
      if (rTO.contains(paramView))
      {
        ab.b(TAG, "stopUnreadBubbleConfetti", new Object[0]);
        paramView.bLM();
        rTO.remove(paramView);
      }
      AppMethodBeat.o(109163);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109163);
    }
  }

  public final MMFragment instantiateAlbumFragment(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(109158);
    paramContext = Fragment.instantiate(paramContext, StoryAlbumUI.class.getName(), paramBundle);
    if (paramContext == null)
    {
      paramContext = new v("null cannot be cast to non-null type com.tencent.mm.ui.MMFragment");
      AppMethodBeat.o(109158);
      throw paramContext;
    }
    paramContext = (MMFragment)paramContext;
    AppMethodBeat.o(109158);
    return paramContext;
  }

  public final Drawable ls(boolean paramBoolean)
  {
    AppMethodBeat.i(109159);
    if (paramBoolean);
    for (int i = 2131231083; ; i = 2131231084)
    {
      Object localObject = ah.getContext();
      a.f.b.j.o(localObject, "MMApplicationContext.getContext()");
      localObject = ((Context)localObject).getResources().getDrawable(i);
      i = a.fromDPToPix(ah.getContext(), 8);
      ((Drawable)localObject).setBounds(0, 0, i, i);
      a.f.b.j.o(localObject, "hintDrawable");
      AppMethodBeat.o(109159);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.r
 * JD-Core Version:    0.6.2
 */