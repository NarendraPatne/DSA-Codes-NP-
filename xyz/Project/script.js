var t1=gsap.timeline();
t1.to("#loader",{
    top:"-200vh",
    delay:2,
    duration:2
})
t1.from("#navbar",{
    y:-200,
    duration:0.5,
    delay :0.5,
})
t1.from("#part1,#part2,#part3",{
    y:-150,
    duration:0.5,
    opacity:0,
    stagger:0.5
})
t1.from("#main h1",{
  x:-1100,
  duration:2,
  stagger:0.5
})
t1.from("#main img",{
    x:100,
    stagger:0.1,
    opacity:0
})
t1.from("#Last",{
    y:500,
    duration:1
})
