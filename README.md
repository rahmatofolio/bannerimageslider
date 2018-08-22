# bannerimageslider
Banner image slider 

# Dependencies required
<pre><code>
//image loading framework
implementation 'com.github.bumptech.glide:glide:4.8.0'
</code></pre>

# Model Class for Slider
model classes requiring in this project

<h6>SlideModel.java</h6>
<pre><code>
public class SlideModel implements Serializable {
    private int id;
    private String imageUrl;
    private int imageCorner;

    public SlideModel(int id, String imageUrl, int imageCorner) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.imageCorner = imageCorner;
    }
    public SlideModel(int id, String imageUrl) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.imageCorner = 0;
    }
}
</code></pre>

# Home slider banner 
sample banner slider at home fragment

<h6>HomeFragment.java</h6>
<pre><code>
public class HomeFragment extends Fragment {
    Slider slider;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        slider = view.findViewById(R.id.slider);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<SlideModel> slideList = new ArrayList<>();
        slideList.add(new SlideModel(0,"https://rahmatofolio.com/sliders/banner1.jpg" ));
        slideList.add(new SlideModel(1,"https://rahmatofolio.com/sliders/banner2.jpg" ));
        slideList.add(new SlideModel(2,"https://rahmatofolio.com/sliders/banner3.jpg" ));
        slideList.add(new SlideModel(3,"https://rahmatofolio.com/sliders/banner4.jpg" ));

        slider.setItemClickListener((adapterView, view, i, l) -> {
            //do what you want
        });
        slider.addSlides(slideList);
    }
}
</code></pre>

# Screenshots
<p> 
<a target="_blank" href="https://raw.githubusercontent.com/rahmatofolio/bannerimageslider/master/screenshots/Screenshot_1.png">
	<img src="https://raw.githubusercontent.com/rahmatofolio/bannerimageslider/master/screenshots/Screenshot_1.png" alt="alt text" width="200" style="max-width:100%;">
</a>
<a target="_blank" href="https://raw.githubusercontent.com/rahmatofolio/bannerimageslider/master/screenshots/Screenshot_2.png">
	<img src="https://raw.githubusercontent.com/rahmatofolio/bannerimageslider/master/screenshots/Screenshot_2.png" alt="alt text" width="200" style="max-width:100%;">
</a>
<a target="_blank" href="https://raw.githubusercontent.com/rahmatofolio/bannerimageslider/master/screenshots/Screenshot_3.png">
	<img src="https://raw.githubusercontent.com/rahmatofolio/bannerimageslider/master/screenshots/Screenshot_3.png" alt="alt text" width="200" style="max-width:100%;">
</a>
<a target="_blank" href="https://raw.githubusercontent.com/rahmatofolio/bannerimageslider/master/screenshots/Screenshot_4.png">
	<img src="https://raw.githubusercontent.com/rahmatofolio/bannerimageslider/master/screenshots/Screenshot_4.png" alt="alt text" width="200" style="max-width:100%;">
</a>
</p>
